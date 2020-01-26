package exercises.codesignal.shapearea;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShapeAreaTest {

    private ShapeArea shapeArea = new ShapeArea();

    @Test
    public void testGetShapeArea_1_ifNumberOfSquaresIs1() {
        final int EXPECTED_RESULT = 1;

        assertEquals(EXPECTED_RESULT, shapeArea.getShapeArea(1));
    }

    @Test
    public void testGetShapeArea_5_ifNumberOfSquaresIs2() {
        final int EXPECTED_RESULT = 5;

        assertEquals(EXPECTED_RESULT, shapeArea.getShapeArea(2));
    }

    @Test
    public void testGetShapeArea_13_ifNumberOfSquaresIs1() {
        final int EXPECTED_RESULT = 13;

        assertEquals(EXPECTED_RESULT, shapeArea.getShapeArea(3));
    }
}
