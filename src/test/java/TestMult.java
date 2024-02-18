//created by Vadim Peregud


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMult {
    private Calculator calc;

    @Before
    public void createNewCalc() {
        calc = new Calculator();

    }

    @Test
    public void test() {
        assertEquals(333, calc.multiplication(111, 3));

    }

}
