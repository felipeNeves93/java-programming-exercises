package exercises.codesignal.centuryFromYear;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CenturyFromYearTest {

    private CenturyFromYear centuryFromYear = new CenturyFromYear();

    @Test
    public void getCenturyFromYear_18_ifYearIs1755() {
        final int EXPECTED_CENTURY = 18;

        assertEquals(EXPECTED_CENTURY, centuryFromYear.getCenturyFromYear(1755));
    }

    @Test
    public void getCenturyFromYear_17_ifYearIs1700() {
        final int EXPECTED_CENTURY = 17;

        assertEquals(EXPECTED_CENTURY, centuryFromYear.getCenturyFromYear(1700));
    }

    @Test
    public void getCenturyFromYear_21_ifYearIs2020() {
        final int EXPECTED_CENTURY = 21
                ;
        assertEquals(EXPECTED_CENTURY, centuryFromYear.getCenturyFromYear(2020));
    }
}
