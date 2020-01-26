package exercises.codesignal.adjacentelementsproduct;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AdjacentElementProductTest {

    private AdjacentElementProduct adjacentElementProduct = new AdjacentElementProduct();

    @Test
    public void getLargestAdjacentElementProduct_21_ifNumbersAre7and3() {
        int[] numbers = {3, 6, -2, -5, 7, 3};

        final int EXPECTED_RESULT = 21;

        assertEquals(EXPECTED_RESULT, adjacentElementProduct.getLargestAdjacentElementProduct(numbers));
    }

    @Test
    public void getLargestAdjacentElementProduct_0_ifNumbersAreEmpty() {
        int[] numbers = new int[1];

        final int EXPECTED_RESULT = 0;

        assertEquals(EXPECTED_RESULT, adjacentElementProduct.getLargestAdjacentElementProduct(numbers));
    }

    @Test
    public void getLargestAdjacentElementProduct_1_ifNumbersAre1and1() {
        int[] numbers = {1, -1, 2, -1, 2, -1};

        final int EXPECTED_RESULT = -1;

        assertEquals(EXPECTED_RESULT, adjacentElementProduct.getLargestAdjacentElementProduct(numbers));
    }

}
