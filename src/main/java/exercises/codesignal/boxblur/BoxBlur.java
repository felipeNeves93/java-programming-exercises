package exercises.codesignal.boxblur;

public class BoxBlur {

    static int[][] solution(int[][] image) {
        final int resultingMatrixNumberOfRows = image.length - 2;
        final int resultingMatrixNumberOfColumns = image[0].length - 2;
        final int amountOfSquaresExpected = resultingMatrixNumberOfRows * resultingMatrixNumberOfColumns;
        final int[][] resultingMatrix = new int[resultingMatrixNumberOfRows][resultingMatrixNumberOfColumns];
        final int amountOfSquaresPerImageRow = (image[0].length - 3) + 1;
        final int amountOfSquaresPerImageColumn = (image.length - 3) + 1;

        int amountOfSquaresCalculated = 0;
        int imageRowPosition = 0;
        int imageColumnPosition = 0;

        // While matrix is not full
        while (amountOfSquaresCalculated < amountOfSquaresExpected) {
            // Loops to fulfill the resulting matrix
            for (int i = 0; i < resultingMatrix.length; i++) {
                for (int j = 0; j < resultingMatrix[i].length; j++) {
                    int squareResult = (image[imageRowPosition][imageColumnPosition] + image[imageRowPosition][imageColumnPosition + 1] + image[imageRowPosition][imageColumnPosition + 2] + image[imageRowPosition + 1][imageColumnPosition] + image[imageRowPosition + 1][imageColumnPosition + 1] + image[imageRowPosition + 1][imageColumnPosition + 2] + image[imageRowPosition + 2][imageColumnPosition] + image[imageRowPosition + 2][imageColumnPosition + 1] + image[imageRowPosition + 2][imageColumnPosition + 2]) / 9;

                    resultingMatrix[i][j] = squareResult;
                    amountOfSquaresCalculated++;
                    imageColumnPosition++;

                    // Resets so the next row can be calculated
                    if (imageColumnPosition == amountOfSquaresPerImageRow) {
                        imageColumnPosition = 0;
                    }
                }
                imageRowPosition++;

                if (imageRowPosition == amountOfSquaresPerImageColumn) {
                    break;
                }
            }
        }
        return resultingMatrix;
    }
}
