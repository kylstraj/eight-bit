(ns eight-bit.prod
  (:require [eight-bit.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
