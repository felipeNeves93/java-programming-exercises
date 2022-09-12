package exercises.codesignal.arrayreplace;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayReplaceTest {

    @Test
    void givenArrayAAndElementsToReplaceThenShouldReturnArrayB() {
        final int elementToReplace = 1;
        final int substitutionElement = 3;

        int[] arrayA = {1, 2, 1};
        int[] arrayB = {3, 2, 3};

        int[] resultingArray = ArrayReplace.solution(arrayA, elementToReplace, substitutionElement);

        for (int i = 0; i < resultingArray.length; i++) {
            assertEquals(resultingArray[i], arrayB[i]);
        }
    }

    @Test
    void givenArrayBAndElementsToReplaceThenShouldReturnArrayC() {
        final int elementToReplace = 2;
        final int substitutionElement = 1;

        int[] arrayB = {1, 2, 1, 2, 1};
        int[] arrayC = {1, 1, 1, 1, 1};

        int[] resultingArray = ArrayReplace.solution(arrayB, elementToReplace, substitutionElement);

        for (int i = 0; i < resultingArray.length; i++) {
            assertEquals(resultingArray[i], arrayC[i]);
        }
    }
}
