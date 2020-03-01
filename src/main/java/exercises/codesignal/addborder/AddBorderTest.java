package exercises.codesignal.addborder;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddBorderTest {

    private AddBorder addBorder = new AddBorder();

    @Test
    public void addBorder_shouldReturnWithBorderLengthOfFive(){
        final int NUMBER_OF_ROWS_EXPECTED = 4;
        final int BORDER_LENGTH_EXPECTED = 5;

        String[] picture = {"abc", "def"};

        String[] pictureWithBord = addBorder.addBorder(picture);

        assertEquals(NUMBER_OF_ROWS_EXPECTED, pictureWithBord.length);
        assertEquals(BORDER_LENGTH_EXPECTED, pictureWithBord[0].length());
    }

    @Test
    public void addBorder_shouldReturnWithBorderLengthOf3(){
        final int NUMBER_OF_ROWS_EXPECTED = 3;
        final int BORDER_LENGTH_EXPECTED = 3;

        String[] picture = {"a"};

        String[] pictureWithBord = addBorder.addBorder(picture);

        assertEquals(NUMBER_OF_ROWS_EXPECTED, pictureWithBord.length);
        assertEquals(BORDER_LENGTH_EXPECTED, pictureWithBord[0].length());
    }
}
