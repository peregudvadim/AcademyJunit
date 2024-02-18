//created by Vadim Peregud

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalcMultTest {


    private final int valueA;
    private final int valueB;
    private final int expected;

    public CalcMultTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "multiply {0} and {1} = {2}")
    public static List<Integer[]> dataForTest() {
        return Arrays.asList(new Integer[][]{
                        {1, 2, 2},
                        {10, 10, 100},
                        {130, 150, 19500}
                }
        );
    }

    @Test
    public void paramTest() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.multiplication(valueA, valueB));
    }
}

