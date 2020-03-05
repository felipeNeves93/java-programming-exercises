package exercises.codesignal.arraysimilar;

public class ArraySimilar {

    boolean areSimilar(int[] a, int[] b) {

        boolean isSwapPerformed = false;

        for (int index = 0; index < a.length; index++) {
            int elementAtIndexFromFirstArray = a[index];
            int elementAtIndexFromSecondArray = b[index];

            if (elementAtIndexFromFirstArray != elementAtIndexFromSecondArray) {
                if (isSwapPerformed) {
                    return false;
                }

                int numberOfTimesThatElementIsPresent = findNumberOfTimesThatElementIsPresent(b, elementAtIndexFromFirstArray);

                if (numberOfTimesThatElementIsPresent == 0) {
                    return false;
                }

                int indexFromElementInSecondArray = this.findIndexOfElement(0, elementAtIndexFromFirstArray, b);

                while (numberOfTimesThatElementIsPresent > 0 && !isSwapPerformed) {
                    this.swapElements(b, index, indexFromElementInSecondArray);

                    if (areSwappedElementsEqualInAllPositions(a, b, index, indexFromElementInSecondArray)) {
                        isSwapPerformed = true;
                    } else {
                        numberOfTimesThatElementIsPresent--;
                        this.swapElements(b, indexFromElementInSecondArray, index);
                        indexFromElementInSecondArray = this.findIndexOfElement(indexFromElementInSecondArray + 1, a[index], b);

                        if (indexFromElementInSecondArray == -1) {
                            return false;
                        }
                    }
                }
                isSwapPerformed = true;
            }
        }

        return true;
    }

    private boolean areSwappedElementsEqualInAllPositions(int[] sourceArray, int[] swappedArray, int initIndex, int swappedIndex) {
        if (sourceArray[initIndex] != swappedArray[initIndex]) {
            return false;
        }

        return sourceArray[swappedIndex] == swappedArray[swappedIndex];
    }

    private int findIndexOfElement(int startingIndex, int element, int[] array) {
        for (int index = startingIndex; index < array.length; index++) {
            if (array[index] == element) {
                return index;
            }
        }
        return -1;
    }

    private int findNumberOfTimesThatElementIsPresent(int[] array, int element) {
        int counterOfTimes = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                counterOfTimes++;
            }
        }

        return counterOfTimes;
    }

    private void swapElements(int[] array, int sourceIndex, int targetIndex) {
        int copyOfSourceElement = array[sourceIndex];

        array[sourceIndex] = array[targetIndex];
        array[targetIndex] = copyOfSourceElement;
    }

}
