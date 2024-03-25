(defun fibonacci-and-factorial (n)
  (let ((fib (fibonacci n))
        (fact (factorial n)))
    (print fib)
    (print fact)))

(defun fibonacci (n)
  (cond
    ((<= n 1) n)
    (t (+ (fibonacci (- n 1)) (fibonacci (- n 2))))))

(defun factorial (n)
  (cond
    ((<= n 1) 1)
    (t (* n (factorial (- n 1))))))

