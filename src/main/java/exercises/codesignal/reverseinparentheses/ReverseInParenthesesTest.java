package exercises.codesignal.reverseinparentheses;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReverseInParenthesesTest {

    public ReverseInParentheses reverseInParentheses = new ReverseInParentheses();

    @Test
    public void reverseInParentheses_shouldReturnTheInputString() {
        final String EXPECTED_STRING = "felipe";

        String reversedInParenthesesString = reverseInParentheses.reverseInParentheses(EXPECTED_STRING);

        assertEquals(EXPECTED_STRING, reversedInParenthesesString);
    }

    @Test
    public void reverseInParentheses_shouldReturnRab() {
        final String EXPECTED_STRING = "rab";

        assertEquals(EXPECTED_STRING, reverseInParentheses
                .reverseInParentheses("(bar)"));
    }

    @Test
    public void reverseInParenthesis_shouldReturnFoobazrabblim() {
        final String EXPECTED_STRING = "foobazrabblim";
        final String STARTING_STRING = "foo(bar(baz))blim";

        String reversedString = reverseInParentheses.reverseInParentheses(STARTING_STRING);
        assertEquals(EXPECTED_STRING, reversedString);
    }
}
