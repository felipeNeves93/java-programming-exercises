package exercises.codeexercises.primenumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PrimeNumberTest {

    private PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void isPrimeNumber_true_ifNumberIsPrime() {
        assertTrue(primeNumber.isPrimeNumber(5));
    }

    @Test
    public void isPrimeNumber_false_ifNumberIsInvalid() {
        assertFalse(primeNumber.isPrimeNumber(-1));
    }

    @Test
    public void isPrimeNumber_false_ifNumberIsNotPrime() {
        assertFalse(primeNumber.isPrimeNumber(4));
    }
}
