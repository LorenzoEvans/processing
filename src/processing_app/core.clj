(ns processing-app.core
  (:gen-class
    :extends processing-app.core.PApplet)
  (:import (processing.core PConstants PApplet)))


(defn main [& args]
  (PApplet/main "processing_with_clojure.core"))

(defn -settings [this]
  (.size this 640 480 PConstants/P3D))

(defn -setup [this]
  (.background this 255 255 255))

(defn -draw [this]
  (if (.-mousePressed this)
    (.fill this 0)
    (.fill this 255))
  (let [x (.-mouseX this)
        y (.-mouseY this)
        width 80
        width 80]
    (.ellipse this x y width height)))