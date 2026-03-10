import static org.junit.jupiter.api.Assertions.assertThrows;

import com.kovanlabsintern.javaweektask.UnitTesting.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testDivisionByZeroThrowsException() {
        Calculator c = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            c.division(10, 0);
        });
    }
}
