(defproject lein-hadoop-cluster "0.1.5-SNAPSHOT"
  :repositories [["factual" {:url      "http://maven.corp.factual.com/nexus/content/groups/public/"
                             :snapshot {:update :always}}]]
  :deploy-repositories [["snapshots" {:url           "http://maven.corp.factual.com/nexus/content/repositories/snapshots"
                                      :sign-releases false}]
                        ["releases" {:url           "http://maven.corp.factual.com/nexus/content/repositories/releases"
                                     :sign-releases false}]]
  :description "Run Leiningen tasks against a live Hadoop cluster."
  :url "http://github.com/llasram/lein-hadoop-cluster"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in :leiningen)
