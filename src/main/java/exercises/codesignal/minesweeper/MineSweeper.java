package exercises.codesignal.minesweeper;

public class MineSweeper {
    static int[][] solution(boolean[][] matrix) {
        final int[][] resultingMatrix = new int[matrix.length][matrix[0].length];
        final int numberOfRows = matrix.length - 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // If its first line, does not consider the upper level
                if (i == 0) {
                    if (j == 0) {
                        int result = (countMine(matrix[i][j + 1]) + countMine(matrix[i + 1][j]) + countMine(matrix[i + 1][j + 1]));
                        resultingMatrix[i][j] = result;
                    } else if (j == matrix[i].length - 1) {
                        int result = (countMine(matrix[i][j - 1]) + countMine(matrix[i + 1][j]) + countMine(matrix[i + 1][j - 1]));
                        resultingMatrix[i][j] = result;
                    } else {
                        int result = (countMine(matrix[i][j - 1]) + countMine(matrix[i][j + 1]) + countMine(matrix[i + 1][j - 1]) + countMine(matrix[i + 1][j]) + countMine(matrix[i + 1][j + 1]));
                        resultingMatrix[i][j] = result;
                    }
                }

                // if its last line, does not consider the down leven
                else if (i == numberOfRows) {
                    if (j == 0) {
                        int result = (countMine(matrix[i][j + 1]) + countMine(matrix[i - 1][j]) + countMine(matrix[i - 1][j + 1]));
                        resultingMatrix[i][j] = result;
                    } else if (j == matrix[i].length - 1) {
                        int result = (countMine(matrix[i][j - 1]) + countMine(matrix[i - 1][j]) + countMine(matrix[i - 1][j - 1]));
                        resultingMatrix[i][j] = result;
                    } else {
                        int result = (countMine(matrix[i][j - 1]) + countMine(matrix[i][j + 1]) + countMine(matrix[i - 1][j - 1]) + countMine(matrix[i - 1][j]) + countMine(matrix[i - 1][j + 1]));
                        resultingMatrix[i][j] = result;
                    }
                }

                // Default operations
                else {
                    if (j == 0) {
                        int result = (countMine(matrix[i][j + 1]) + countMine(matrix[i - 1][j]) + countMine(matrix[i - 1][j + 1]) + countMine(matrix[i + 1][j]) + countMine(matrix[i + 1][j + 1]));
                        resultingMatrix[i][j] = result;
                    } else if (j == matrix[i].length - 1) {
                        int result = (countMine(matrix[i][j - 1]) + countMine(matrix[i - 1][j]) + countMine(matrix[i - 1][j - 1]) + countMine(matrix[i + 1][j]) + countMine(matrix[i + 1][j - 1]));
                        resultingMatrix[i][j] = result;
                    } else {
                        int result = (countMine(matrix[i][j - 1]) + countMine(matrix[i][j + 1]) + countMine(matrix[i - 1][j - 1]) + countMine(matrix[i - 1][j]) + countMine(matrix[i - 1][j + 1]) + countMine(matrix[i + 1][j - 1]) + countMine(matrix[i + 1][j]) + countMine(matrix[i + 1][j + 1]));

                        resultingMatrix[i][j] = result;
                    }
                }
            }

        }

        return resultingMatrix;
    }

    private static int countMine(boolean mine) {
        return mine ? 1 : 0;
    }
}
