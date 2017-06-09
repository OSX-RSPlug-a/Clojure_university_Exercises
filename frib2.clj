(defn fibo [n]
  (if (< n 3)
      1
      (+
        (fibo (- n 1))
        (fibo (- n 2))
      )
  )
)


(fibo 6)
