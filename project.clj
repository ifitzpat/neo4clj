(defproject neo4clj "0.0.1-SNAPSHOT"
  :description "Clojure 1.2 bindings for Neo4j 1.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
;                 [org.clojure/clojure-contrib "1.8.0"]
                 [org.neo4j/neo4j-kernel "3.3.2"]
                 [org.neo4j/neo4j-index "3.3.2"]]
  ; :dev-dependencies [[swank-clojure "1.2.1"]]
  ; :dev-dependencies [[autodoc "0.7.1"]]
  ; :dev-dependencies [[lein-javac "1.2.1-SNAPSHOT"]]
  :repositories {"neo4j-public-repository" "https://m2.neo4j.org"}

  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]

  :warn-on-reflection true
  :aot [neo4clj.core])
