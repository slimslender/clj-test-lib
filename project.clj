(defproject clj-test-lib "0.1.0-SNAPSHOT"
  :description "Test Library to validate Leiningen me deploy policy"
  :url "http://github.com/slimslender/clj-test-lib"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repositories [["releases" {:url "https://sforzando.jfrog.io/sforzando/libs-release-local"
                              :username [:env/mvn_artifactorymavenrepository_user]
                              :password [:env/mvn_artifactorymavenrepository_pwd]}]]
  :repl-options {:init-ns clj-test-lib.core})
