(ns hello-world-clj.core
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, World!"})

(defn -main []
  (jetty/run-jetty handler {:port 3002}))
