//created by Vadim Peregud

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestAdd {
    private Calculator calc;

    @Before
    public void createNewCalc() {
        calc = new Calculator();
    }

    @Test
    public void test() {
        assertEquals(10, calc.addition(5, 5));
    }
}
