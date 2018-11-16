(ns kfrm.events
  (:require
   [re-frame.core :as re-frame]
   [kfrm.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
