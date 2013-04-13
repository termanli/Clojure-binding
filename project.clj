(defproject clojure-binding "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :checksum-deps true
  :disable-deps-clean false
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies [[swank-clojure/swank-clojure "1.5.0-SNAPSHOT"]
                     [lein-run/lein-run "1.0.1-SNAPSHOT"]]
  :source-path "src"
  :compile-path "target/classes"
  :library-path "target/dependency"
  :jar-name "clojure-binding.jar")