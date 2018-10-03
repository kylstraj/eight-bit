(ns ^:figwheel-no-load eight-bit.dev
  (:require
    [eight-bit.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
