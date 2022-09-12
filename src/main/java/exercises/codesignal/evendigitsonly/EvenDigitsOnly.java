package exercises.codesignal.evendigitsonly;

public class EvenDigitsOnly {

    static boolean solution(int n) {
        var convertedNumber = Integer.toString(n);
        var splittedNumber = convertedNumber.split("");

        for (String number : splittedNumber) {
            boolean isEven = isEven(Integer.parseInt(number));

            if (!isEven) {
                return false;
            }
        }

        return true;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
