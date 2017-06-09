;;(apply * (range 1 (inc %)))

(defn show2 [x]
  (if (<= x 1) 1 (* x  (show2 (- x 1))  )))