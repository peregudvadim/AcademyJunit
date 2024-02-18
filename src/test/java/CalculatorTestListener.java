//created by Vadim Peregud

import junit.framework.TestSuite;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

    @Override
    public void testFinished(Description description) {
        System.out.println("Execution Finished: " + description.getMethodName());
    }

    public static void main(String[] args) {

        JUnitCore core = new JUnitCore();
        core.addListener(new CalculatorTestListener());
        core.run(TestSuite.class);
        core.run(CalcMultTest.class);
        core.run(CalcSubtractionTest.class);
        core.run(CalcAdditionTest.class);
        core.run(TestAdd.class);
        core.run(TestMult.class);
        core.run(TestSub.class);


    }
}