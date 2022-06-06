import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        var obj1 = new Calculator();
        assertEquals(7, obj1.add(3, 4));
    }
}