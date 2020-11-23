import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Absolute_Number_CalculatorTest {

    @Test
    void testFindAbsolute() {
        int number = 0;
        int expected = 0;

        int result = Absolute_Number_Calculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative() {
        int number = 1;
        int expected = 1;

        int result = Absolute_Number_Calculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}