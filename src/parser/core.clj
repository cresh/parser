(ns parser.core
  (:require [active.ephemerol.char-set :as char-set]
            [active.ephemerol.scanner :as scanner]
            [active.ephemerol.scanner-run :as scanner-run]
            [active.lawrence.runtime :as lr-runtime]
            [active.lawrence.grammar :as lr-grammar]
            [active.lawrence.direct-lr :as lr-parser]))

;; lawrence grammar for expressions
(lr-grammar/define-grammar grammar
  (:+ :- :* :/ :l :r :n)
  E
  ((E ((T) $1)
      ((T :+ E) (+ $1 $3))
      ((T :- E) (- $1 $3)))
   (T ((P) $1)
      ((P :* T) (* $1 $3))
      ((P :/ T) (/ $1 $3)))
   (P ((:n) $1)
      ((:l E :r) $2))))

;; emit scan results in the format that lawrence expects
(defmacro make-scan-result-for-lawrence
  [?enum ?lexeme->attribute]
  `(fn [lexeme# _position# input# input-position#]
     (scanner-run/make-scan-result (lr-runtime/make-pair (lr-grammar/terminal grammar ~?enum)
                                                         (~?lexeme->attribute lexeme#))
                                   input# input-position#)))

;; scanner action for keywords
(defmacro keyword-result
  [?enum]
  `(make-scan-result-for-lawrence ~?enum
                                  ;; keywords have no attribute payload
                                  (~constantly nil)))

;; scanner action for numbers
(defmacro number-result
  []
  `(make-scan-result-for-lawrence :n
                                 ;; numbers have their integer representation as attribute payload
                                  ~(fn [lexeme#] (Integer/parseInt lexeme#))))

;; forward declare scanner for one token
(declare scan-one)

;; scanner specification
(def scanner-specification
  (scanner/scanner-spec
    ;; skip whitespace
    (char-set/char-set:whitespace
    (fn [_lexeme _position input input-position]
      (scan-one input input-position)))

    ;; keywords
    ("+" (keyword-result :+))
    ("-" (keyword-result :-))
    ("*" (keyword-result :*))
    ("/" (keyword-result :/))
    ("(" (keyword-result :l))
    (")" (keyword-result :r))

    ;; numbers
    ((+ char-set/char-set:digit) (number-result))))

;; scan one token
(def scan-one
  (scanner-run/make-scan-one
    (eval (scanner-run/scanner->expression (scanner/compute-scanner scanner-specification)))))

;; scan whole input
(defn scan
  [input]
  (let [scanned (scanner-run/scan-to-list scan-one (scanner-run/string->list input)
                                          (scanner-run/make-position 1 0))
        scan-result (first scanned)]
    (if (scanner-run/scan-error? scan-result)
      ;; handle scan error
      (throw (Exception. (pr-str scanned)))
      scan-result)))

;; parse scanned input
(defn parse
  [input]
  (lr-parser/parse grammar 1 :slr input))

;; scan and parse input
(def scan+parse
  (comp parse scan))

;; example
(scan+parse "1+2*(65/5)")
