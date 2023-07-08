(ns solutions)

;; Problem 1

true

;; Problem 2

4

;; Problem 3

"HELLO WORLD"

;; Problem 4

:a :b :c

;; Problem 5

'(1 2 3 4)

;; Problem 6

:a :b :c

;; Problem 7

[1 2 3 4]

;; Problem 8

#{:a :b :c :d}

;; Problem 9

2

;; Problem 10

20

;; Problem 11

{:b 2}

;; Problem 12

3

;; Problem 13

'(20 30 40)

;; Problem 14

8

;; Problem 15

#(* % 2)

;; Problem 16

(fn [name] (str "Hello, " name "!"))

;; Problem 17

'(6 7 8)

;; Problem 18

'(6 7)

;; Problem 19

#(first (reverse %))

;; Problem 20

(fn [col]
  (if (< (count col) 2)
    nil
    (get (vec col) (- (count col) 2))))

;; Problem 21

(fn [col index]
  (get (vec col) index))

;; Problem 22

#(reduce inc 0 %)

;; Problem 23

(fn [coll] (loop [coll coll
                  acc '()]
             (if (empty? coll)
               acc
               (recur (rest coll) (cons (first coll) acc)))))

;; Problem 24

#(reduce + 0 %)

;; Problem 25

#(filter odd? %)

;; Problem 26

(fn [num]
  (loop [x 0 coll '()]
    (if (= x num)
      (reverse coll)
      (cond
        (= x 0) (recur (inc x) (conj coll 1))
        (= x 1) (recur (inc x) (conj coll 1))
        :else (recur (inc x) (conj coll (+(first coll) (second coll))))))))

;; Problem 27

(fn [coll]
  (= (reverse (seq coll)) (seq coll)))

;; Problem 28

(defn my-flat [coll]
  (if (sequential? coll)
    (mapcat my-flat coll)
    (list coll)))

;; Problem 29

(defn is-upper-case? [char]
  (= (str char) (clojure.string/upper-case (str char))))

(defn remove-non-letters [phrase]
  (re-seq #"[a-zA-Z]" phrase ))

#(apply str (filter is-upper-case? (remove-non-letters %)))

;; Problem 30

(defn remove-dups [in]
  (loop [x (seq in)
         acc []]
    (if-not (first x)
      (apply list acc)
      (if-not (= (first x) (last acc))
        (recur (rest x) (conj acc (first x)))
        (recur (rest x) acc)))))

;; Problem 31

#(partition-by identity %)

;; Problem 32

#(mapcat identity (map (fn [i] [i i]) %))

;; Problem 33

(fn [col n]
  (mapcat identity (map #(repeat n %) col)))

;; Problem 34

(defn my-func [x y]
  (loop [acc (vector x)]
    (if (= (last acc) (- y 1))
      (apply list acc)
      (recur (conj acc (inc (last acc)))))))


;; Problem 35

7

;; Problem 36

[x 7 y 3 z 1]

;; Problem 37

"ABC"

;; Problem 38

(defn f [& args]
  (loop [in args
         m (first in)]
    (if (empty? in)
      m
      (recur (rest in) (if (> (first in) m)
                         (first in)
                         m)))))

;; Problem 39

(defn f39 [a b]
  (loop [col1 a
         col2 b
         acc []]
    (if (or (empty? col1) (empty? col2))
       acc
       (recur (rest col1) (rest col2) (conj acc (first col1) (first col2))))))

;; Problem 40

(defn f40 [in col]
  (loop [x col
         acc []]
    (if (empty? x)
      (butlast acc)
      (recur (rest x) (conj acc (first x) in)))))

;; Problem 41

(defn f41 [x y]
  (loop [col x
         acc []]
    (cond
      (empty? col) acc
      (= (mod (+ 1 (.indexOf x (first col))) y) 0) (recur (rest col) acc)
      :else (recur (rest col) (conj acc (first col))))))
