(ns jaimesangcap.algorithms.binary-search)

(defn binary_search [items x]
  "Returns the index of x from the given items.
  Returns nil when x is not found or items is nil or empty."
  (loop [low 0
         high (dec (count items))]
    (when (<= low high)
      (let [mid (quot (+ high low) 2)
            guess (nth items mid)]
        (cond
          (= guess x) mid
          (< guess x) (recur (inc mid) high)
          (> guess x) (recur low (dec high)))))))

(comment
  (dec (count nil))
  (dec (count []))
  (def my-items [1 4 07 8 19 20 30 50 100])
  (binary_search my-items 100)
  ,)
