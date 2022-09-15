package exercises.codesignal.variablename;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class VariableNameTests {

    @Test
    void givenCoorectInputAThenShouldReturnTrue() {
        var correctInputA = "var_1__Int";

        var result = VariableName.solution(correctInputA);
        assertTrue(result);
    }

    @Test
    void givenIncorrectInputAThenShouldReturnFalse() {
        var incorrectInputA = "qq-q";

        var result = VariableName.solution(incorrectInputA);
        assertFalse(result);
    }

    @Test
    void givenCoorectInputBThenShouldReturnTrue() {
        var correctInputB = "variable0";

        var result = VariableName.solution(correctInputB);
        assertTrue(result);
    }
}
