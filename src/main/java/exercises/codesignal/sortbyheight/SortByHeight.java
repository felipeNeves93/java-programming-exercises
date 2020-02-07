package exercises.codesignal.sortbyheight;

public class SortByHeight {

    public int[] sortByHeight(int[] a) {
        for (int startingSortPosition = 0; startingSortPosition < a.length; startingSortPosition++) {
            if (!isTree(a[startingSortPosition])) {
                for (int unsortedElementPosition = 0; unsortedElementPosition < a.length -1; unsortedElementPosition++) {
                    this.swapElementToNextValidPosition(unsortedElementPosition, a);
                }
            }
        }

        return a;
    }

    private boolean isTree(int number) {
        return number == -1;
    }

    private boolean swapElementToNextValidPosition(int indexToSwap, int[] elements) {
        int elementToSwap = elements[indexToSwap];
        int elementToBeSwapped = elements[indexToSwap + 1];

        if (isTree(elementToBeSwapped)) {
            for (int startingIndex = indexToSwap + 1; startingIndex < elements.length
                    && isTree(elementToBeSwapped); startingIndex++) {
                elementToBeSwapped = elements[startingIndex];

                if (!isTree(elementToBeSwapped) && elementToSwap > elementToBeSwapped) {
                    elements[startingIndex] = elementToSwap;
                    elements[indexToSwap] = elementToBeSwapped;

                    return true;
                }
            }
        }
        if (!isTree(elementToBeSwapped) && elementToSwap > elementToBeSwapped) {
            elements[indexToSwap + 1] = elementToSwap;
            elements[indexToSwap] = elementToBeSwapped;

            return true;
        }
        return false;
    }
}
