package exercises.codesignal.matrixelementsum;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatrixElementSumTest {
    private MatrixElementSum matrixElementSum = new MatrixElementSum();

    @Test
    public void matrixElementSum_shouldReturn9summingUp112and5() {
        final int EXPECTED_RESULT = 9;
        int[][] matrix = new int[][]{
                {0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}};

        assertEquals(EXPECTED_RESULT, matrixElementSum.matrixElementSum(matrix));
    }
}
