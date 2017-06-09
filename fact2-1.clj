(defn cont [n]
  (if(= n 0)
      (print 1)
      (do
        (print n" ")
        (cont (- (* n 2) 1)

        )
        )
  )
)

(cont 3)