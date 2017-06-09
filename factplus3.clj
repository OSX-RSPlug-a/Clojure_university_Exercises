(defn cont [n1]
  (if(= n1 0)
      (print 1)
      (do
        (print n1" ")
        (cont (* n1 2)

        )
        )
  )
)

(cont 1)