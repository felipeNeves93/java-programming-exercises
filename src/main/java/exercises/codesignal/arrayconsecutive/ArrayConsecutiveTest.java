package exercises.codesignal.arrayconsecutive;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayConsecutiveTest {

    private ArrayConsecutive arrayConsecutive = new ArrayConsecutive();

    @Test
    public void makeArrayConsecutive_shouldReturn3statuesNeeded() {
        final int NUMBER_OF_STATUES_NEEDED = 3;
        final int[] testArray = {6, 2, 3, 8};

        assertEquals(NUMBER_OF_STATUES_NEEDED,
                arrayConsecutive.makeArrayConsecutive(testArray));
    }

    @Test
    public void makeArrayConsecutive_shouldReturn2statuesNeeded() {
        final int NUMBER_OF_STATUES_NEEDED = 2;
        final int[] testArray = {0, 3};

        assertEquals(NUMBER_OF_STATUES_NEEDED,
                arrayConsecutive.makeArrayConsecutive(testArray));
    }

    @Test
    public void makeArrayConsecutive_shouldReturn1statuesNeeded() {
        final int NUMBER_OF_STATUES_NEEDED = 1;
        final int[] testArray = {0, 2};

        assertEquals(NUMBER_OF_STATUES_NEEDED,
                arrayConsecutive.makeArrayConsecutive(testArray));
    }

    @Test
    public void makeArrayConsecutive_shouldReturn0statuesNeeded() {
        final int NUMBER_OF_STATUES_NEEDED = 0;
        final int[] testArray = {0, 1};

        assertEquals(NUMBER_OF_STATUES_NEEDED,
                arrayConsecutive.makeArrayConsecutive(testArray));
    }
}
