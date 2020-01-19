package exercises.codeexercises.fizzbuzz;

public class FizzBuzz {
    public String fizzBuzz(Integer number) {
        if (isMultipleOfFive(number) && isMultipleOfThree(number)) {
            return "FizzBuzz";
        }

        if (isMultipleOfThree(number)) {
            return "Fizz";
        }

        return isMultipleOfFive(number) ? "Buzz" : number.toString();
    }

    private boolean isMultipleOfFive(int number) {
        return (number % 5 == 0);
    }

    private boolean isMultipleOfThree(int number) {
        return (number % 3 == 0);
    }
}


