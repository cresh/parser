(ns parser.generated-test
  (:require [clojure.test :refer :all]
            [clojure.java.io :as io]
            [parser.generated-scanner :as scanner]
            [parser.generated-parser :as parser]))

(defn string->stream
  ([s] (string->stream s "UTF-8"))
  ([s encoding]
   (-> s
       (.getBytes encoding)
       (java.io.ByteArrayInputStream.))))

(defn scan+parse
  [input]
  (with-open [rdr (io/reader (string->stream input))]
    (let [sc (scanner/scan rdr)]
      (let [ps (parser/parse (first sc))]
        ps))))

(deftest t-scan+parse
  (is (= 27 (scan+parse "1+2*(65/5)"))))
