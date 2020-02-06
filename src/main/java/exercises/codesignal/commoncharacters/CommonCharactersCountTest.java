package exercises.codesignal.commoncharacters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CommonCharactersCountTest {

    private CommonCharactersCount commonCharactersCount = new CommonCharactersCount();

    @Test
    public void commonCharactersCount_shouldReturn3() {
        final int EXPECTED_VALUE = 3;
        String wordOne = "aabcc";
        String wordTwo = "adcaa";

        assertEquals(EXPECTED_VALUE, commonCharactersCount.commonCharacterCount(wordOne, wordTwo));
    }

    @Test
    public void commonCharactersCount_shouldReturn4() {
        final int EXPECTED_VALUE = 4;
        String wordOne = "zzzz";
        String wordTwo = "zzzzzzzz";

        assertEquals(EXPECTED_VALUE, commonCharactersCount.commonCharacterCount(wordOne, wordTwo));
    }
}
