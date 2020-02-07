package exercises.codesignal.sortbyheight;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortByHeightTest {
    private SortByHeight sortByHeight = new SortByHeight();

    @Test
    public void sortByHeigh_shouldBringTheSortedArrayWithTheInitialValueOf150() {
        int[] elements = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] resultado = sortByHeight.sortByHeight(elements);

        assertEquals(resultado[1], 150);
        assertEquals(resultado[2], 160);
        assertEquals(resultado[3], 170);
        assertEquals(resultado[6], 180);
        assertEquals(resultado[7], 190);
    }

    @Test
    public void test_shouldBringTheSortedArrayWithTheInitialValueOf1() {
        int[] elements = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
        int[] resultado = sortByHeight.sortByHeight(elements);

        assertEquals(resultado[0], 1);
        assertEquals(resultado[1], 3);
        assertEquals(resultado[3], 23);
        assertEquals(resultado[4], 43);
        assertEquals(resultado[7], 54);
        assertEquals(resultado[11], 77);
    }
}
