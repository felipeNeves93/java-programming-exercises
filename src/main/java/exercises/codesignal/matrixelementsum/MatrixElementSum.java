package exercises.codesignal.matrixelementsum;

import java.util.ArrayList;
import java.util.List;

public class MatrixElementSum {
    public int matrixElementSum(int[][] matrix) {
        int accumulator = 0;
        List<Integer> matrixLineZeroSpots = new ArrayList<>();

        for (int matrixCounter = 0; matrixCounter < matrix.length; matrixCounter++) {
            for (int matrixElementCounter = 0; matrixElementCounter < matrix[matrixCounter].length; matrixElementCounter++) {
                int matrixLineElement = matrix[matrixCounter][matrixElementCounter];

                if (matrixLineElement == 0) {
                    matrixLineZeroSpots.add(matrixElementCounter);
                }

                if (!matrixLineZeroSpots.contains(matrixElementCounter)){
                    accumulator += matrixLineElement;
                }
            }
        }

        return accumulator;
    }
}
