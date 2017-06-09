(defn delta [a b c]
  (- (* b b) (* 4 a c))
)

(defn x1 [a b c]          ;;(-b - raiz delta)/(2a)
  (/ (- (* -1 b) (Math/sqrt (delta a b c))) (* 2 a))
)

(defn x2 [a b c]
  (/ (+ (* -1 b) (Math/sqrt (delta a b c))) (* 2 a))
)

(defn eq [a b c]
  (println (x1 a b c))
  (println (x2 a b c))
)

(eq 1 1 -2)