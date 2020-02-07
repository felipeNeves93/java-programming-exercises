package exercises.codesignal.isLucky;

public class IsLucky {

    public boolean isLucky(int n) {
        String numberConverted = String.valueOf(n);
        int stringLength = numberConverted.length();

        if (stringLength % 2 > 0) {
            return false;
        }

        int half = stringLength / 2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int index = 0; index < numberConverted.length(); index++) {
            int convertedNumber = Integer.parseInt(numberConverted.substring(index, index + 1));

            if (index < half) {
                firstHalfSum += convertedNumber;
            } else {
                secondHalfSum += convertedNumber;
            }
        }

        return firstHalfSum == secondHalfSum;
    }
}
