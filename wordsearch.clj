#!/usr/bin/env bb

(ns wordsearch
  (:import (java.util.regex Pattern)))

(defn index-to-re [index]
  (Pattern/compile index))

(defn options [index wordlist]
  (map #(re-matches (index-to-re %) wordlist))

(defn init-wordsearch [size]
  )

(defn wordsearch [wordlist size]
  (reduce
   (fn [])
   (init-wordsearch size)))
