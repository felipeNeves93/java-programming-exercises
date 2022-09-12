package exercises.codesignal.evendigitsonly;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EvenDigitsOnlyTest {

    @Test
    void givenNumberAThenShouldReturnTrue() {
        int numberA = 248622;

        boolean result = EvenDigitsOnly.solution(numberA);
        assertTrue(result);
    }

    @Test
    void givenNumberBThenShouldReturnFalse() {
        int numberA = 642386;

        boolean result = EvenDigitsOnly.solution(numberA);
        assertFalse(result);
    }
}
