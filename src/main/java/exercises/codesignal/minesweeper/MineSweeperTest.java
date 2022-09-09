package exercises.codesignal.minesweeper;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MineSweeperTest {

    @Test
    void givenMatrixAThenShouldReturnMatrixB() {
        boolean[][] matrixA = {
                {true, false, false},
                {false, true, false},
                {false, false, false}
        };

        int[][] expectedMatrix = {
                {1, 2, 1},
                {2, 1, 1},
                {1, 1, 1}
        };

        int[][] matrixB = MineSweeper.solution(matrixA);

        for (int i = 0; i < expectedMatrix.length; i++) {
            for (int j = 0; j < expectedMatrix[i].length; j++) {
                assertEquals(matrixB[i][j], expectedMatrix[i][j]);
            }
        }
    }

    @Test
    void givenMatrixBThenShouldReturnMatrixC() {
        boolean[][] matrixB = {
                {true, false, false, true},
                {false, false, true, false},
                {true, true, false, true}
        };

        int[][] expectedMatrix = {
                {0, 2, 2, 1},
                {3, 4, 3, 3},
                {1, 2, 3, 1}
        };

        int[][] matrixC = MineSweeper.solution(matrixB);

        for (int i = 0; i < expectedMatrix.length; i++) {
            for (int j = 0; j < expectedMatrix[i].length; j++) {
                assertEquals(matrixC[i][j], expectedMatrix[i][j]);
            }
        }
    }
}
