(ns refactoring-exercises.sequences)

(defn factorial [n]
  (->> (range 1N (inc n))
       (reduce *)))

(defn first-letters [words]
  (map first words))

(defn- next-character [c]
  (char (inc (int c))))

(defn character-range [first-inclusive last-inclusive]
  (->> (iterate next-character first-inclusive)
       (take-while (fn[char] (<= (compare char last-inclusive) 0)))))
