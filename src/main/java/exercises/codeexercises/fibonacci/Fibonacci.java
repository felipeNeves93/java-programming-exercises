package exercises.codeexercises.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Integer> createFibonacciSequence(int numberOfElements) {
        List<Integer> fribonacciSequence = new ArrayList<>();

        int remainingNumbersToBeAdded = numberOfElements;

        while (remainingNumbersToBeAdded > 0) {
            fribonacciSequence.add(this.getNextFribonacciSequenceValue(fribonacciSequence));
            remainingNumbersToBeAdded--;
        }

        return fribonacciSequence;
    }

    public Integer getNthElementOfFibonacciSequence(int elementNumber) {
        final int LAST_ELEMENT = elementNumber - 1;
        return this.createFibonacciSequence(elementNumber).get(LAST_ELEMENT);
    }

    private Integer getNextFribonacciSequenceValue(List<Integer> fribonacciSequence) {
        if (this.isFribonacciSequenceFirstElement(fribonacciSequence.size())) {
            return 0;
        }

        if (this.isFribonacciSequenceSecondElement(fribonacciSequence.size())) {
            return 1;
        }

        return this.getSumOfTheLastTwoElements(fribonacciSequence);
    }

    private Integer getSumOfTheLastTwoElements(List<Integer> fribonacciSequence) {
        final int LAST_ELEMENT = fribonacciSequence.size() - 1;
        final int PENULTIMATE_ELEMENT = LAST_ELEMENT - 1;

        return fribonacciSequence.get(LAST_ELEMENT) + fribonacciSequence.get(PENULTIMATE_ELEMENT);
    }

    private boolean isFribonacciSequenceFirstElement(int size) {
        return size == 0;
    }

    private boolean isFribonacciSequenceSecondElement(int size) {
        return size == 1;
    }
}
