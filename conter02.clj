;; este e um ex para listar um range de numeros na ordem crescente

(defn print1 [y]
  (if(= y 10)
    (println "\n 10 poits. You Win! \n")
    (do (print y " ") (print1 (+ y 1)))
    ))

(print1 0)
