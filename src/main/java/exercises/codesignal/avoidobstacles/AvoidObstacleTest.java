package exercises.codesignal.avoidobstacles;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AvoidObstacleTest {

    private AvoidObstacle avoidObstacle = new AvoidObstacle();

    @Test
    public void avoidObstacleWith53679array_shouldReturn4() {
        final int[] inputArray = {5, 3, 6, 7, 9};
        final var expectedValue = 4;

        var result = avoidObstacle.avoidObstacles(inputArray);
        assertEquals(expectedValue, result);
    }

    @Test
    public void avoidObstacleWith23array_shouldReturn4() {
        final int[] inputArray = {2, 3};
        final var expectedValue = 4;

        var result = avoidObstacle.avoidObstacles(inputArray);
        assertEquals(expectedValue, result);
    }

    @Test
    public void avoidObstacleWith141062array_shouldReturn4() {
        final int[] inputArray = {1, 4, 10, 6, 2};
        final var expectedValue = 7;

        var result = avoidObstacle.avoidObstacles(inputArray);
        assertEquals(expectedValue, result);
    }
}
