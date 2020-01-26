package exercises.codesignal.centuryFromYear;

public class CenturyFromYear {

    public int getCenturyFromYear(int year) {
        if (year < 0) {
            return 0;
        }
        if (year <= 100) {
            return 1;
        }

        return year % 100 == 0 ? year / 100 : year / 100 + 1;
    }
}
