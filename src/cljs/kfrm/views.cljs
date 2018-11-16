(ns kfrm.views
  (:require
   [re-frame.core :as re-frame]
   [kfrm.subs :as subs]
   ))

(defn main-panel []
  (let
    [
      name (re-frame/subscribe [::subs/name])
    ]
    [:div
      (for [i (range 0 5)]
        [:h1 "Hello from " @name " " i]
      )
      [:div#thing
        ""
      ]
    ]
  )
)
