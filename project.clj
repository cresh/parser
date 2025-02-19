(defproject parser "0.1.0-SNAPSHOT"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ephemerol "0.5.0"]
                 [lawrence "0.11.0"]]
  :aliases {"generate" ["run" "-m" "parser.generate"]})
