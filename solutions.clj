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

