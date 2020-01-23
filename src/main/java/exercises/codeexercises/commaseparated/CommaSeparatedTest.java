package exercises.codeexercises.commaseparated;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CommaSeparatedTest {

    CommaSeparated commaSeparated = new CommaSeparated();

    @Test
    public void getCommaSeparatedStringOfIntegerList_o3e44_ifNumbersAre3And44() {
        final String EXPECTED_VALUE = "o3,e44";

        List<Integer> numbers = Arrays.asList(3, 44);

        String commaSeparatedString = commaSeparated.getCommaSeparatedStringOfIntegerList(numbers);
        Assert.assertEquals(EXPECTED_VALUE, commaSeparatedString);
    }
}
