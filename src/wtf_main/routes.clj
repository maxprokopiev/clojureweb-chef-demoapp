(ns wtf-main.routes
    (:use [clojurewerkz.route-one.compojure])
    (:require [compojure.core :as compojure]
              [compojure.route :as route]))

(compojure/defroutes main-routes
  (GET root "/" request (wtf-main.handlers.home/index request))
  (GET favicon "/favicon.ico" _ (fn [_] {:render :nothing}))
  (route/not-found "Page not found"))
