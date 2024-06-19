(clojure.core/ns parser.generated-scanner (:require [clojure.string :as string] [active.ephemerol.scanner-run :refer :all] [active.lawrence.runtime :as lr-runtime] [active.lawrence.grammar :as lr-grammar] [parser.core :refer [keyword-result number-result]]))
(clojure.core/declare scanner scan-one)
(def scanner (clojure.core/let [final (clojure.core/object-array 9) scanner (active.ephemerol.scanner-run/make-scanner nil nil (clojure.core/int-array (clojure.core/read-string "[2 3 4 5 6 7 8 1 -1 -1 -1 -1 -1 -1 -1 -1 1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1]")) final 8 8 (clojure.core/int-array (clojure.core/read-string "[0 161 161 161 161 161 321 225 161 459 459 459 459 587 481 657 625 161 161 161 161 161 785 193 1027 1213 161 609 161 161 161 161 1469 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 160 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 1709 161 161 161 161 1565 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 1759 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161 161]")) (clojure.core/int-array (clojure.core/read-string "[-1 -1 -1 -1 -1 -1 -1 -1 -1 0 0 0 0 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 -1 -1 -1 -1 -1 -1 5 6 3 1 -1 2 -1 4 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 0 0 0 0 0 0 0 0 0 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 0 -1 -1 -1 -1 -1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7]")) (clojure.core/fn [lexeme start-position last-input last-position] (active.ephemerol.scanner-run/make-scan-result nil last-input last-position)))] (clojure.core/let [action1 ^{:line 64, :column 34} (number-result) action2 ^{:line 52, :column 5} (fn [_lexeme _position input input-position] ^{:line 53, :column 7} (scan-one input input-position)) action3 ^{:line 56, :column 10} (keyword-result :+) action4 ^{:line 57, :column 10} (keyword-result :-) action5 ^{:line 58, :column 10} (keyword-result :*) action6 ^{:line 59, :column 10} (keyword-result :/) action7 ^{:line 60, :column 10} (keyword-result :l) action8 ^{:line 61, :column 10} (keyword-result :r)] (clojure.core/aset final 1 action1) (clojure.core/aset final 2 action2) (clojure.core/aset final 3 action3) (clojure.core/aset final 4 action4) (clojure.core/aset final 5 action5) (clojure.core/aset final 6 action6) (clojure.core/aset final 7 action7) (clojure.core/aset final 8 action8)) scanner))
(def scan-one (active.ephemerol.scanner-run/make-scan-one scanner))
(clojure.core/defn scan [x__1185__auto__] (clojure.core/with-open [r__1186__auto__ (clojure.java.io/reader x__1185__auto__)] (active.ephemerol.scanner-run/scan-to-list scan-one (active.ephemerol.scanner-run/reader->list r__1186__auto__) (active.ephemerol.scanner-run/make-position 1 0))))
