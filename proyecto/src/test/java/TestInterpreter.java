import com.example.Environment;
import com.example.Evaluator;
import com.example.Parser;
import com.example.Test;

public class TestInterpreter {
    @Test
    void testFahrenheitToCelsius() {
        Environment env = new Environment();
        Evaluator evaluator = new Evaluator(env);
        Object result = evaluator.evaluate(new Parser().parse("(fahrenheit-to-celsius 32)"));
        assertEquals(0.0, (double) result, 0.01);
    }

    private void assertEquals(double d, double result, double e) {
        if (Math.abs(d - result) < e) {
            return;
        }
        
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testFibonacciAndFactorial() {
        Environment env = new Environment();
        Evaluator evaluator = new Evaluator(env);
        evaluator.evaluate(new Parser().parse("(fibonacci-and-factorial 5)"));
        
    }
}


