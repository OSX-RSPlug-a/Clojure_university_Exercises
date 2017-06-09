;; este codigo e a resolucao do exercicio 7

(defn show4 [a b c]
 (let [D (- (* b b) (* 4 a c))]
      (if (< D 0) #{}
        (let [sqrtD (Math/sqrt D)
              x1 (/ (+ (- b) sqrtD) (* 2 a))
              x2 (/ (- (- b) sqrtD) (* 2 a))]
              (set [x1 x2])))))


(show4 1 2 1)
