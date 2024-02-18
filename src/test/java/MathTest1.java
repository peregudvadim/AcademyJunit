//created by Vadim Peregud

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest1 {

    @Test
    public void testSquareRoot(){
        double result = Math.sqrt(225);
        assertEquals(15,result,0);
    }
}
