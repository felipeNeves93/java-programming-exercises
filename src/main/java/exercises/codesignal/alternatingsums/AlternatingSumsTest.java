package exercises.codesignal.alternatingsums;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlternatingSumsTest {

    private AlternatingSums alternatingSums = new AlternatingSums();

    @Test
    public void alternatingSums_shouldReturnEmptyArray() {
        int[] array = new int[0];

        assertEquals(alternatingSums.alternatingSums(array).length, 0);
    }

    @Test
    public void alternatingSums_shouldReturn180and105() {
        int[] array = {50, 60, 60, 45, 70};
        int[] result = alternatingSums.alternatingSums(array);

        assertEquals(180, result[0]);
        assertEquals(105, result[1]);
    }
}
