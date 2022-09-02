package exercises.codesignal.boxblur;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BoxBlurTest {

    @Test
    void givenImageAShouldBeEqualToResultMatrix() {
        int[][] imageA = new int[3][3];
        int[][] resultMatrix = new int[1][1];
        resultMatrix[0][0] = 1;

        imageA[0][0] = 1;
        imageA[0][1] = 1;
        imageA[0][2] = 1;

        imageA[1][0] = 1;
        imageA[1][1] = 7;
        imageA[1][2] = 1;

        imageA[2][0] = 1;
        imageA[2][1] = 1;
        imageA[2][2] = 1;

        int[][] result = BoxBlur.solution(imageA);

        assertEquals(resultMatrix.length, result.length);
        assertEquals(resultMatrix[0].length, result[0].length);
        assertEquals(resultMatrix[0][0], result[0][0]);
    }

    @Test
    void givenImageBShouldBeEqualToResultMatrix() {
        int[][] imageB = new int[3][4];
        int[][] resultMatrix = new int[1][2];
        resultMatrix[0][0] = 40;
        resultMatrix[0][1] = 30;

        imageB[0][0] = 36;
        imageB[0][1] = 0;
        imageB[0][2] = 18;
        imageB[0][3] = 9;

        imageB[1][0] = 27;
        imageB[1][1] = 54;
        imageB[1][2] = 9;
        imageB[1][3] = 0;

        imageB[2][0] = 81;
        imageB[2][1] = 63;
        imageB[2][2] = 72;
        imageB[2][3] = 45;

        int[][] result = BoxBlur.solution(imageB);

        assertEquals(resultMatrix.length, result.length);
        assertEquals(resultMatrix[0].length, result[0].length);
        assertEquals(resultMatrix[0][0], result[0][0]);
        assertEquals(resultMatrix[0][1], result[0][1]);
    }
}
