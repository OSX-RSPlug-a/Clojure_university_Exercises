;; Avaliacao exercicio 4 refeito - tranformar sec em Hr-min-sec
;; require - e como o import em java
;; let - e como defn mas para variaveis locais, entao defn e para variaveis globais
;; quot - retorna a divisao do valor e ou o restante do valor da variavel
;; rem - divide o primeiro valor pelo segundo
;; conj - serve para listar uma sequencia de valores
;; when - condicional para valores dependentes de outros valores

(require '[clojure.string :as string])(defn tmp [dur]
  (let [int-sec (int dur)
        days        (quot int-sec 86400)
        days-r      (rem int-sec 86400)
        hours       (quot days-r 3600)
        hours-r     (rem days-r 3600)
        minutes     (quot hours-r 60)
        seconds     (rem hours-r 60)]
        (string/join " " (filter #(not (string/blank? %))
                         (conj []
                               (when (> days 0) (str days "d"))
                               (when (> hours 0) (str hours "h"))
                               (when (> minutes 0) (str minutes "m"))
                               (when (> seconds 0) (str seconds "s"))
                               )))))


(tmp 20000)
