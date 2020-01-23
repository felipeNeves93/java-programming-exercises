package exercises.codeexercises.longestpalindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void findLongestPalindromeInWord_abcba_ifWordIsjosscmlabcbawoekk() {
        final String TEST_WORD = "josscmlabcbawoekk";
        final String EXPECTED_PALINDROME = "abcba";

        assertEquals(EXPECTED_PALINDROME, longestPalindrome.findLongestPalindromeInWord(TEST_WORD));
    }
}
