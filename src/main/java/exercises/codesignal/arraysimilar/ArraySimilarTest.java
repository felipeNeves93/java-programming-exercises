package exercises.codesignal.arraysimilar;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ArraySimilarTest {

    private ArraySimilar arraySimilar = new ArraySimilar();

    @Test
    public void areSimilar_shouldReturnTrueFor2121112And1121212() {
        int[] arrayA = {2, 1, 2, 1, 1, 1, 2};
        int[] arrayB = {1, 1, 2, 1, 2, 1, 2};

        assertTrue(arraySimilar.areSimilar(arrayA, arrayB));
    }

    @Test
    public void areSimilar_shouldReturnTrueFor123And123() {
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};

        assertTrue(arraySimilar.areSimilar(arrayA, arrayB));
    }

    @Test
    public void areSimilar_shouldReturnFalseFor122And211() {
        int[] arrayA = {1, 2, 2};
        int[] arrayB = {2, 1, 1};

        assertFalse(arraySimilar.areSimilar(arrayA, arrayB));
    }
}
