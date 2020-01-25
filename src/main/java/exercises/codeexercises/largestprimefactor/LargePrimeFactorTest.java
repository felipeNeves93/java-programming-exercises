package exercises.codeexercises.largestprimefactor;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LargePrimeFactorTest {

    private LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

    @Test(expectedExceptions = UnsupportedOperationException.class)
    public void getLargestPrimeFactor_unsupportedOperationException_ifNumberIs1() {
        largestPrimeFactor.getLargestPrimeFactor(1);
    }

    @Test
    public void getLargestPrimeFactor_13_ifNumberIs455() {
        final int EXPECTED_NUMBER = 13;

        assertEquals(EXPECTED_NUMBER, largestPrimeFactor.getLargestPrimeFactor(455));
    }

    @Test
    public void getLargestPrimeFactor_5_ifNumberIs15() {
        final int EXPECTED_NUMBER = 5;

        assertEquals(EXPECTED_NUMBER, largestPrimeFactor.getLargestPrimeFactor(15));
    }
}
