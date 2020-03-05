package exercises.codesignal.arraychange;

public class ArrayChange {

   public int arrayChange(int[] inputArray) {
        if (inputArray.length == 1) {
            return 0;
        }

        int incrementCounter = 0;

        for (int i = 0; i < inputArray.length; i++) {
            int elementValueAtIndex = inputArray[i];

            if (i + 1 < inputArray.length) {
                while (elementValueAtIndex >= inputArray[i + 1]) {
                    inputArray[i + 1]++;
                    incrementCounter++;
                }
            }
        }
        return incrementCounter;
    }
}
