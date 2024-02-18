//created by Vadim Peregud


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalcSubtractionTest {

    private final int valueA;
    private final int valueB;
    private final int expected;

    public CalcSubtractionTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "subtraction {0} and {1} = {2}")
    public static List<Integer[]> dataForTest() {
        return Arrays.asList(new Integer[][]{
                {5, 1, 4},
                {15, 25, -10},
                {115, -16, 131}}
        );
    }

    @Test
    public void paramTest() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.subtraction(valueA, valueB));

    }
}
