(defn show3 [a b c]
  (let [sq-d (Math/sqrt (- (* b b) (* 4 a c)))
        f    #(/ (% b sq-d) (* 2 a))]
    (cond
       (neg? sq-d)  nil
       (zero? sq-d) (f +)
       (pos? sq-d)  [(f +) (f -)]
       :else nil)))