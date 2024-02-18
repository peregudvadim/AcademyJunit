//created by Vadim Peregud

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MathTest2 {

    @Test
    public void testPow(){
        double result = Math.pow(15,2);
        assertEquals(225,result,0);

    }
}
