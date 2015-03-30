(ns resolve-fail.core
  (:import resolve_fail.Thing)
  )

(defn foo
  [x ^String y]
  (Thing/hello x y))
