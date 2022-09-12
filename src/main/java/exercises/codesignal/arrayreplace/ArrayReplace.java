package exercises.codesignal.arrayreplace;

public class ArrayReplace {

    public static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] resultArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            int valueToAdd = inputArray[i];

            if (valueToAdd == elemToReplace) {
                valueToAdd = substitutionElem;
            }

            resultArray[i] = valueToAdd;
        }

        return resultArray;
    }
}
