(ns reverse-string)

(defn reverse-string [s]
  (reduce (fn [acc char] (str char acc)) "" (seq s))
)
