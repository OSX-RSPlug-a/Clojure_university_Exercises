(defn media [b1 b2 b3 b4]
  (/ (+ b1 b2 b3 b4) 4.0)
)

(defn aprov [b1 b2 b3 b4]
  (if (>= (media b1 b2 b3 b4) 5)
      (print "Aprovado")
      (print "Reprovado")
  )
)

(aprov 5 5 5 4.8)