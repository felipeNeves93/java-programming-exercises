package exercises.codeexercises.largestprimefactor;

public class LargestPrimeFactor {

    public int getLargestPrimeFactor(int number) {
        if (number == 1) {
            throw new UnsupportedOperationException("Only numbers greater than 1 are allowed");
        }

        int largestFactor = 1;

        for (int i = 2; i < number; i++) {
            int divisionRemainingResult = number % i;

            if (divisionRemainingResult == 0 && isPrimeNumber(i)) {
                largestFactor = Math.max(i, largestFactor);
            }
        }
        return largestFactor;
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i * 2 < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
