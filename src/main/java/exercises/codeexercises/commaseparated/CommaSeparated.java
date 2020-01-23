package exercises.codeexercises.commaseparated;

import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

    private static final String EVEN_LETTER_REPRESENTATION = "e";
    private static final String ODD_LETTER_REPRESENTATION = "o";

    public String getCommaSeparatedStringOfIntegerList(List<Integer> numbers) {
        List<String> numbersWithLetters = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.toList());

        return numbersWithLetters.stream()
                .map(number -> number = this.concatenateLetterRepresentationBasedOnNumber(number))
                .collect(Collectors.joining(","));
    }

    public String concatenateLetterRepresentationBasedOnNumber(String convertedNumber) {

        if (convertedNumber.length() > 1) {
            char[] individualConvertedNumbers = convertedNumber.toCharArray();

            final char FIRST_NUMBER = individualConvertedNumbers[0];

            for (int i = 1; i < individualConvertedNumbers.length; i++) {
                if (individualConvertedNumbers[i] != FIRST_NUMBER) {
                    return ODD_LETTER_REPRESENTATION.concat(convertedNumber);
                }
            }
            return EVEN_LETTER_REPRESENTATION.concat(convertedNumber);
        }
        return ODD_LETTER_REPRESENTATION.concat(convertedNumber);
    }
}
