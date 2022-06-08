import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        var obj1 = new Calculator();
        assertEquals(8, obj1.add(4, 4));
    }
    @Test
    public void testSub(){
        var obj2 = new Calculator();
        assertEquals(6, obj2.sub(11, 5));
    }
}