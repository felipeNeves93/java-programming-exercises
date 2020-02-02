package exercises.codesignal.alllongeststrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AllLongestStringsTest {
    private AllLongestStrings allLongestStrings = new AllLongestStrings();

    @Test
    public void allLongestStrings_shouldReturnAllThoseWithThreeLetters() {
        final int EXPECTED_NUMBER_OF_STRINGS = 3;
        String[] arrayOfWords = {"aba", "aa", "ad", "vcd", "aba"};

        assertEquals(EXPECTED_NUMBER_OF_STRINGS, allLongestStrings.getAllLongestStrings(arrayOfWords).length);
    }

    @Test
    public void allLongestStrings_shouldReturnFelipe() {
        final String EXPCTED_STRING = "felipe";
        final int EXPECTED_SIZE = 1;

        String[] arrayOfWords = {"aba", "aa", "ad", "vcd", "aba", "felipe"};
        String[] result = allLongestStrings.getAllLongestStrings(arrayOfWords);

        assertEquals(EXPECTED_SIZE, result.length);
        assertEquals(EXPCTED_STRING, result[0]);
    }
}
