import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void additionTest() {
        Calculator c = new Calculator();
        assertEquals(2,c.add(1,1),"the output shoiuld be the sum of two argument");
    }
}
