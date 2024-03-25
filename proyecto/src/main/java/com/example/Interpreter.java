package com.example;

public class Interpreter {
    private Parser parser;
    private Evaluator evaluator;

    public Interpreter() {
        this.parser = new Parser();
        this.evaluator = new Evaluator(new Environment());
    }

    public void run() {
        evaluator.evaluate(parser.parse("(fahrenheit-to-celsius 32)"));
        evaluator.evaluate(parser.parse("(fibonacci-and-factorial 5)"));
    }
}
