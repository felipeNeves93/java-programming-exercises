package exercises.codeexercises.greatestcommondivisor;

public class GreatestCommonDivisor {

    public int findGreatestCommonDivisorBetweenPositiveIntegers(int firstNumber, int secondNumber) {
        if (firstNumber <= 0 || secondNumber <= 0) {
            throw new UnsupportedOperationException("Only positive numbers greater than 0 are allowed");
        }

        if (firstNumber == 1 || secondNumber == 1) {
            return 1;
        }

        int maximumDivisor = Math.min(firstNumber, secondNumber);

        for (int i = maximumDivisor; i > 0; i--) {
            if (isExactDivision(firstNumber, i) && isExactDivision(secondNumber, i)) {
                return i;
            }
        }

        return 0;
    }

    private boolean isExactDivision(int number, int divisor) {
        return number % divisor == 0;
    }
}
