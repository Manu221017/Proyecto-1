package com.example;

import java.util.List;

public class Evaluator {
    public Evaluator(Environment env) {
    }

    public Object evaluate(List<Object> expression) {
        Object operator = expression.get(0);
        if (operator instanceof String) {
            String op = (String) operator;
            if (op.equals("fahrenheit-to-celsius")) {
                double fahrenheit = Double.parseDouble(expression.get(1).toString());
                return Function.fahrenheitToCelsius(fahrenheit);
            } else if (op.equals("fibonacci-and-factorial")) {
                int n = Integer.parseInt(expression.get(1).toString());
                Function.fibonacciAndFactorial(n);
                return null;
            }
        }
        // Otras implementaciones para evaluación de expresiones Lisp
        return null;
    }
}
