package exercises.codesignal.isLucky;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsLuckyTest {

    private IsLucky isLucky = new IsLucky();

    @Test
    public void isLucky_shouldReturnFalseBecauseDigitsAreNotEven() {
        int number = 239017;

        assertFalse(isLucky.isLucky(number));
    }

    @Test
    public void isLucky_shouldReturnTrueBecauseDigitsEvenAndTheSumOfTheFirstHalfIsEqualToTheSecond() {
        int number = 1230;
        assertTrue(isLucky.isLucky(number));
    }
}
