(ns parser.core-test
  (:require [clojure.test :refer :all]
            [parser.core :refer :all]))

(deftest t-scan+parse
  (is (= 27 (scan+parse "1+2*(65/5)"))))
