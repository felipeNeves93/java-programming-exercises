package exercises.codesignal.arraychange;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayChangeTest {

    private ArrayChange arrayChange = new ArrayChange();

    @Test
    public void arrayChange_shouldReturn3() {
        int[] array = {1, 1, 1};
        final int EXPECTED_RESULT = 3;

        assertEquals(EXPECTED_RESULT, arrayChange.arrayChange(array));
    }

    @Test
    public void arrayChange_shouldReturn5() {
        int[] array = {-1000, 0, -2, 0};
        final int EXPECTED_RESULT = 5;

        assertEquals(EXPECTED_RESULT, arrayChange.arrayChange(array));
    }

    @Test
    public void arrayChange_shouldReturn13() {
        int[] array = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
        final int EXPECTED_RESULT = 13;

        assertEquals(EXPECTED_RESULT, arrayChange.arrayChange(array));
    }
}
