(defn cont [n]
  (if(= n 0)
      (print 1)
      (do
        (print n" ")
        (cont  (- n 3)

        )
        )
  )
)

(cont 70)