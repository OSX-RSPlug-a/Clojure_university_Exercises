(require '[clojure.string :as string])
(defn tmp [dur]
  (let [int-seconds (int dur)
        days        (quot int-seconds 86400)
        days-r      (rem int-seconds 86400)
        hours       (quot days-r 3600)
        hours-r     (rem days-r 3600)
        minutes     (quot hours-r 60)
        seconds     (rem hours-r 60)]
    (string/join " "
                 (filter #(not (string/blank? %))
                         (conj []
                               (when (> days 0) (str days "d"))
                               (when (> hours 0) (str hours "h"))
                               (when (> minutes 0) (str minutes "m"))
(when (> seconds 0) (str seconds "s")))))))