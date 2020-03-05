package exercises.codesignal.palindromerearranging;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PalindromeRearrangingTest {

    private PalindromeRearranging palindromeRearranging = new PalindromeRearranging();

    @Test
    public void palindromeRearranging_shouldReturnTrueForAabb() {
        String word = "aabb";
        assertTrue(palindromeRearranging.palindromeRearranging(word));
    }

    @Test
    public void palindromeRearrangng_shouldReturnFalseForAaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa() {
        String word = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        assertFalse(palindromeRearranging.palindromeRearranging(word));
    }

    @Test
    public void palindromeRearrangng_shouldReturnFalseForAbca() {
        String word = "abca";
        assertFalse(palindromeRearranging.palindromeRearranging(word));
    }
}
