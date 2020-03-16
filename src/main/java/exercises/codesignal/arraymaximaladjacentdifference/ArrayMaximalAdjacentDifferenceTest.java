package exercises.codesignal.arraymaximaladjacentdifference;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayMaximalAdjacentDifferenceTest {

    private ArrayMaximalAdjacentDifference arrayMaximalAdjacentDifference = new ArrayMaximalAdjacentDifference();

    @Test
    public void arrayMaximalAdjacentDifference_shouldReturn3() {
        final int EXPECTED_RESULT = 3;

        int[] array = {10, 13, 11};
        assertEquals(EXPECTED_RESULT, arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(array));
    }

    @Test
    public void arrayMaximalAdjacentDifference_shouldReturn5() {
        final int EXPECTED_RESULT = 5;

        int[] array = {10, 15, 11};
        assertEquals(EXPECTED_RESULT, arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(array));
    }

    @Test
    public void arrayMaximalAdjacentDifference_shouldReturn1() {
        final int EXPECTED_RESULT = 1;

        int[] array = {10, 11, 12};
        assertEquals(EXPECTED_RESULT, arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(array));
    }
}
