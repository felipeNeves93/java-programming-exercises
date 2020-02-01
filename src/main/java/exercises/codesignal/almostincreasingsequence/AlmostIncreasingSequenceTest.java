package exercises.codesignal.almostincreasingsequence;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AlmostIncreasingSequenceTest {

    private AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();

    @Test
    public void isAlmostIncreasingSequence_shouldReturnFalseRemovingAnyElement() {
        final int[] numbers = {1, 3, 2, 1};
        assertFalse(almostIncreasingSequence.isAlmostIncreasingSequence(numbers));
    }

    @Test
    public void isAlmostIncreasingSequence_shouldReturnTrueRemoving3() {
        final int[] numbers = {1, 3, 2};
        assertTrue(almostIncreasingSequence.isAlmostIncreasingSequence(numbers));
    }

    @Test
    public void isAlmostIncreasingSequence_shouldReturnTrueWithOnlyOneElement() {
        final int[] numbers = new int[0];
        assertTrue(almostIncreasingSequence.isAlmostIncreasingSequence(numbers));
    }

    @Test
    public void isAlmostIncreasingSequence_shouldReturnFalseRemovingEither1or2() {
        final int[] numbers = {1, 2, 1, 2};
        assertFalse(almostIncreasingSequence.isAlmostIncreasingSequence(numbers));
    }

}
