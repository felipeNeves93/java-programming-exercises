package exercises.codesignal.alternatingsums;

public class AlternatingSums {

    public int[] alternatingSums(int[] a) {
        if (a.length == 0) {
            return a;
        }
        if (a.length == 1) {
            return new int[]{a[0], 0};
        }

        int[] resultingArray = new int[2];
        final int GROUP_1_POSITION = 0;
        final int GROUP_2_POSITION = 1;

        for (int index = 0; index < a.length; index++) {
            int number = a[index];

            if (isEvenNumber(index)) {
                resultingArray[GROUP_1_POSITION] += number;
                continue;
            }
            resultingArray[GROUP_2_POSITION] += number;
        }

        return resultingArray;
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
