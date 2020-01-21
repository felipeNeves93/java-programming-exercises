package exercises.codeexercises.filterstrings;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class FilterStringTest {

    private FilterString filterString = new FilterString();

    @Test
    public void filterStartWithALetterAndThreeLettersOnly_0_withoutAnyWordEligible() {
        List<String> words = Arrays.asList("felipe", "neves", "test");
        assertEquals(0, filterString.filterStartWithALetterAndThreeLettersOnly(words).size());
    }

    @Test
    public void filterStartWithALetterAndThreeLettersOnly_air_withOneWordEligible() {
        final String EXPECTED_WORD = "air";
        List<String> words = Arrays.asList("felipe", "air", "guitar");

        List<String> filteredWords = filterString.filterStartWithALetterAndThreeLettersOnly(words);
        assertEquals(1, filteredWords.size());
        assertEquals(EXPECTED_WORD, filteredWords.get(0));
    }
}
