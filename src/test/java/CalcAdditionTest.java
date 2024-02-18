//created by Vadim Peregud

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalcAdditionTest extends Assert {


    private final int valueA;
    private final int valueB;
    private final int expected;

    public CalcAdditionTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "sum {0} and {1} = {2}")
    public static List<Integer[]> dataForTest() {
        return Arrays.asList(new Integer[][]{
                        {1, 2, 3},
                        {10, 10, 20},
                        {130, 150, 280}
                }
        );
    }

    @Test
    public void paramTest() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.addition(valueA, valueB));
    }
}



