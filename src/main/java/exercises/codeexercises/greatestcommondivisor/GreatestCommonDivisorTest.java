package exercises.codeexercises.greatestcommondivisor;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    private GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

    @Test
    public void findGreatestCommonDivisorBetweenPositiveIntegers_5_between35and20() {
        int EXPECTED_DIVISOR = 5;
        assertEquals(EXPECTED_DIVISOR, greatestCommonDivisor.findGreatestCommonDivisorBetweenPositiveIntegers(35, 20));
    }
}
