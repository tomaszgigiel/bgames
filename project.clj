(defproject bgames "1.0.0.0-SNAPSHOT"
  :description "bgames: board games notes"
  :url "http://tomaszgigiel.pl"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojure/tools.logging "0.5.0"]]

  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :resource-paths ["src/main/resources"]
  :target-path "target/%s"
  :jar-name "bgames.jar"
  :uberjar-name "bgames-uberjar.jar"
  :main pl.tomaszgigiel.bgames.core
  :aot [pl.tomaszgigiel.bgames.core]
  :profiles {:test {:resource-paths ["src/test/resources"]}}
)
