package exercises.codesignal.matchingparenthesis;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class MatchingParenthesisTest {

    private MatchingParenthesis matchingParenthesis = new MatchingParenthesis();

    @Test
    public void isExpressionBalanced_false_ifExpressionIsWrong() {
        assertFalse(matchingParenthesis.isExpressionBalanced(")("));
    }

    @Test
    public void isExpressionBalanced_true_ifExpressionIsBalanced() {
        assertTrue(matchingParenthesis.isExpressionBalanced("([{a}])"));
    }
}
