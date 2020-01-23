package exercises.codeexercises.longestcommonsubsequence;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    public void findLongestCommonSubsequenceBetweenTwoWords_abc_ifWordsAreAbcdefAndDcdcdcabc() {
        final String EXPECTED_SEQUENCE = "abc";
        final String TEST_WORD_ONE = "abcdef";
        final String TEST_WORD_TWO = "dcdcdcabc";

        assertEquals(EXPECTED_SEQUENCE, longestCommonSubsequence
                .findLongestCommonSubsequenceBetweenTwoWords(TEST_WORD_ONE, TEST_WORD_TWO));
    }

    @Test
    public void findLongestCommonSubsequenceBetweenTwoWords_empty_ifWordsAreAbcAndCba() {
        final String TEST_WORD_ONE = "abc";
        final String TEST_WORD_TWO = "cba";

        assertTrue(longestCommonSubsequence
                .findLongestCommonSubsequenceBetweenTwoWords(TEST_WORD_ONE, TEST_WORD_TWO).isEmpty());
    }
}
