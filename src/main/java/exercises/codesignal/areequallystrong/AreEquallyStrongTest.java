package exercises.codesignal.areequallystrong;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AreEquallyStrongTest {

    private AreEquallyStrong areEquallyStrong = new AreEquallyStrong();

    @Test
    public void areEquallyStrong_shouldReturnTrueFor10101010() {
        assertTrue(areEquallyStrong.areEquallyString(10, 10, 10, 10));
    }

    @Test
    public void areEquallyStrong_shouldReturnTrueFor10151015() {
        assertTrue(areEquallyStrong.areEquallyString(10, 15, 10, 15));
    }

    @Test
    public void areEquallyStrong_shouldReturnFalseFor9101010() {
        assertTrue(areEquallyStrong.areEquallyString(9, 10, 10, 10));
    }
}
