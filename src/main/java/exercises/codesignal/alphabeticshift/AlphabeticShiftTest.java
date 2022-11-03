package exercises.codesignal.alphabeticshift;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlphabeticShiftTest {

    private AlphabeticShift alphabeticShift = new AlphabeticShift();

    @Test
    public void givenCrazyThenShouldReturnDsbaz() {
        final var word = "crazy";
        final var expectedWord = "dsbaz";
        final var convertedWord = alphabeticShift.alphabeticShift(word);

        assertEquals(convertedWord, expectedWord);
    }

    @Test
    public void givenAThenShouldReturnB() {
        final var word = "a";
        final var expectedWord = "b";
        final var convertedWord = alphabeticShift.alphabeticShift(word);

        assertEquals(convertedWord, expectedWord);
    }
}
