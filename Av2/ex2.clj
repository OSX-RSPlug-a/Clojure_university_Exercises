(defn value [n1 n2 n3 op]

(if (= op "A")
  (/ (+ n1 n2 n3) 3.0)

  (do (if (= op "P")
        (+ (* n1 0.5) (* n2 0.3) (* n3 0.2))
  )
  )
  )

)

(value 6 4 8 "A")


