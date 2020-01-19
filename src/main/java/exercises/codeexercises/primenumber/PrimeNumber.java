package exercises.codeexercises.primenumber;

public class PrimeNumber {

    public boolean isPrimeNumber(Integer number) {
        if (number < 0) {
            return false;
        }
        return (number % 2 > 0) && (number % 3 > 0);
    }
}
