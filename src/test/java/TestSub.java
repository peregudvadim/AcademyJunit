//created by Vadim Peregud

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSub {
    private Calculator calc;

    @Before
    public void createNewCalc() {
        calc = new Calculator();
    }

    @Test
    public void test() {
        assertEquals(133, calc.subtraction(166, 33));
    }
}
