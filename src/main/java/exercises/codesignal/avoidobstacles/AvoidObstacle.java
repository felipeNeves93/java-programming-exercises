package exercises.codesignal.avoidobstacles;

public class AvoidObstacle {

    public int avoidObstacles(int[] inputArray) {
        // Sort the array, allowing us to find the bigger element
        this.sortArray(inputArray);

        final var maxElement = inputArray[inputArray.length - 1];
        var currentPoint = 0;
        var sumFactor = 2;

        // After find the biggest element, find a sum factor to jump the obstacles and reach the end,
        // without hiting any obstacle. Starts from 0, with sum factor 2
        while (currentPoint < maxElement) {
            currentPoint += sumFactor;

            // Check if the element exists in the array.
            var isPositionAnObstacle = this.isElementExists(currentPoint, inputArray);

            // If is an obstacle, add one to sum factor and starts again
            if(isPositionAnObstacle){
                sumFactor++;
                currentPoint = 0;
            }
        }

        return sumFactor;
    }

    private boolean isElementExists(int element, int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == element) {
                return true;
            }
        }

        return false;
    }

    private void sortArray(int[] inputArray) {
        var sorted = false;

        while (!sorted) {
            sorted = true;

            // Sort the array using bubble sort
            for (var i = 0; i < inputArray.length - 1; i++) {
                var currentElement = inputArray[i];
                var nextElement = inputArray[i + 1];

                if (currentElement > nextElement) {
                    sorted = false;

                    inputArray[i] = nextElement;
                    inputArray[i + 1] = currentElement;
                }
            }
        }
    }
}
