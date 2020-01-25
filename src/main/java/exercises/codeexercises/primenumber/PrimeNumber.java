package exercises.codeexercises.primenumber;

public class PrimeNumber {

    public boolean isPrimeNumber(int number) {
        if (number <= 0 || number == 1) {
            return false;
        }

        for (int i = 2; 2 * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
