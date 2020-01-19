package exercises.codeexercises.fibonacci;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void createFribonacciSequence_01123591321_withNineElements() {
        List<Integer> expectedSequence = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21);
        List<Integer> fribonacciSequenceWithNineElements = fibonacci.createFibonacciSequence(9);

        int sequenceCurrentPosition = 0;

        for (Integer sequenceValue : fribonacciSequenceWithNineElements) {
            assertEquals(expectedSequence.get(sequenceCurrentPosition), sequenceValue);
            sequenceCurrentPosition++;
        }
    }

    @Test
    public void getNthElementOfFibonacciSequence_144_ifIs13thElement() {
        final Integer THIRTEENTH_ELEMENT_VALUE = 144;

        assertEquals(THIRTEENTH_ELEMENT_VALUE, fibonacci.getNthElementOfFibonacciSequence(13));
    }
}
