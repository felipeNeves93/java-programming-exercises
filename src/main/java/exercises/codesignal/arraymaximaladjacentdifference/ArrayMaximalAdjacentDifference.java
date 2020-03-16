package exercises.codesignal.arraymaximaladjacentdifference;

public class ArrayMaximalAdjacentDifference {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        if (inputArray.length == 1) {
            return 0;
        }

        return this.findMaximalAdjacentDifference(inputArray);
    }

    private int findMaximalAdjacentDifference(int[] array) {
        int maximalAdjacentDifference = 0;

        for (int index = 0; index < array.length - 1; index++) {
            int adjacentDifference = this.findDifference(array[index], array[index + 1]);

            maximalAdjacentDifference = Math.max(adjacentDifference, maximalAdjacentDifference);
        }

        return maximalAdjacentDifference;
    }

    private int findDifference(int elementOne, int elementTwo) {
        if (elementOne >= elementTwo) {
            return elementOne - elementTwo;
        }

        return elementTwo - elementOne;
    }
}
