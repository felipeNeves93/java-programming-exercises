package exercises.codeexercises.palindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void isPalindrome_true_ifWordIsPalindrome() {
        final String PALIDROME_WORD = "aabbccbbaa";
        assertTrue(palindromeChecker.isPalindrome(PALIDROME_WORD));
    }

    @Test
    public void isPalindrome_false_ifWordIsntPalidrome() {
        final String NON_PALINDROME_WORD = "abc";
        assertFalse(palindromeChecker.isPalindrome(NON_PALINDROME_WORD));
    }
}
