package GenericCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenericCalculatorTest {

    @Test
    void test_sum() {
        Operation operation = new Operation();
        assertEquals(10.0,operation.sum(8,2));
    }

    @Test
    void test_subtract() {
        Operation operation = new Operation();
        assertEquals(6.0, operation.subtract(8,2));
    }

    @Test
    void test_divide() {
        Operation operation = new Operation();
        assertEquals(4.0, operation.divide(8,2));
    }

    @Test
    void test_multiply() {
        Operation operation = new Operation();
        assertEquals(16.0, operation.multiply(8,2));
    }
}