package exercises.codeexercises.fizzbuzz;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_Fizz_ifNumberIsMultipleOfThree() {
        final String EXPECTED_RESULT = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(EXPECTED_RESULT, fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void fizzBuzz_Buzz_ifNumberIsMultipleOfFive() {
        final String EXPECTED_RESULT = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(EXPECTED_RESULT, fizzBuzz.fizzBuzz(5));
    }

    @Test
    public void fizzBuzz_FizzBuzz_ifNumberIsMultipleOfThreeAndFive() {
        final String EXPECTED_RESULT = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(EXPECTED_RESULT, fizzBuzz.fizzBuzz(15));
    }

    @Test
    public void fizzBuzz_1_ifNumberIsNotMultipleOfThreeAndFive() {
        final String EXPECTED_RESULT = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(EXPECTED_RESULT, fizzBuzz.fizzBuzz(1));
    }
}
