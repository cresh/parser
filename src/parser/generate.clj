(ns parser.generate
  (:require [active.ephemerol.scanner :as scanner]
            [active.ephemerol.scanner-run :as scanner-run]
            [active.lawrence.lr :as lr-parser]
            [parser.core :as core]))

(defn parse-error
  [message expected-terminals remaining-input]
  (throw (Exception. (pr-str message expected-terminals remaining-input))))

(defn -main
  [& _args]
  (scanner-run/write-scanner-ns (scanner/compute-scanner core/scanner-specification)
                                'parser.generated-scanner
                                '([active.lawrence.runtime :as lr-runtime]
                                  [active.lawrence.grammar :as lr-grammar]
                                  [parser.core :refer [keyword-result number-result]])
                                "src/parser/generated_scanner.clj")
  (lr-parser/write-ds-parse-ns core/grammar 1 :slr 'parser.generated-parser
                               '([parser.generate :refer [parse-error]])
                               "src/parser/generated_parser.clj"))
