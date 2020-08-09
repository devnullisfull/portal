(ns portal.colors
  (:require [clojure.spec.alpha :as s]))

(def themes
  {::nord
   {::text "#d8dee9"
    ::background "#2e3440"
    ::background2 "#2a2e39"
    ::boolean "#5e81ac"
    ::string "#a3be8c"
    ::keyword "#5e81ac"
    ::namespace "#88c0d0"
    ::tag "#ebcb8b"
    ::symbol "#d8dee9"
    ::number "#b48ead"
    ::uri "#d08770"
    ::border "#4c566a"
    ::package "#88c0d0"
    ::exception "#bf616a"
    ::diff-add "#a3be8c"
    ::diff-remove "#bf616a"}
   ::solarized-dark
   {::text "#93a1a1"
    ::background "#073642"
    ::background2 "#002b36"
    ::boolean "#268bd2"
    ::string "#859900"
    ::keyword "#268bd2"
    ::namespace "#2aa198"
    ::tag "#b58900"
    ::symbol "#93a1a1"
    ::number "#d33682"
    ::uri "#cb4b16"
    ::border "#586e75"
    ::package "#2aa198"
    ::exception "#dc322f"
    ::diff-add "#859900"
    ::diff-remove "#dc322f"}
   ::solarized-light
   {::text "#93a1a1"
    ::background "#fdf6e3"
    ::background2 "#eee8d5"
    ::boolean "#268bd2"
    ::string "#859900"
    ::keyword "#268bd2"
    ::namespace "#2aa198"
    ::tag "#b58900"
    ::symbol "#93a1a1"
    ::number "#d33682"
    ::uri "#cb4b16"
    ::border "#839496"
    ::package "#2aa198"
    ::exception "#dc322f"
    ::diff-add "#859900"
    ::diff-remove "#dc322f"}})

(s/def ::theme (set (keys themes)))

