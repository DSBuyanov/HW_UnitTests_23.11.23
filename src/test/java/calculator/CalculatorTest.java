
package calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // Existing tests...

    // New test for the calculateDiscount method
    @Test
    void calculateDiscountValidInput() {
        assertEquals(90.0, calculator.calculateDiscount(100.0, 10.0));
    }

    @Test
    void calculateDiscountNegativeInput() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-100.0, 10.0));
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(100.0, -10.0));
    }
}
