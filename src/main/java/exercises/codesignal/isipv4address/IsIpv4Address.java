package exercises.codesignal.isipv4address;

import java.util.Arrays;
import java.util.List;

public class IsIpv4Address {

    public boolean isIPv4Address(String inputString) {
        if (inputString == null || inputString.isBlank()) {
            return false;
        }

        var splittedList = Arrays.asList(inputString.split("\\."));

        return this.doValidations(splittedList);
    }

    private boolean doValidations(List<String> splittedList) {
        if (!this.isContainFourElements(splittedList)) {
            return false;
        }

        if (!this.areAllElementsValidNumbers(splittedList)) {
            return false;
        }

        return areAllNumbersInsideRange(splittedList);
    }

    private boolean areAllNumbersInsideRange(List<String> splittedList) {
        final var MIN_VALUE = 0;
        final var MAX_VALUE = 255;

        return splittedList.stream()
                .map(Integer::parseInt)
                .noneMatch(number -> number < MIN_VALUE || number > MAX_VALUE);
    }

    private boolean isContainFourElements(List<String> splittedList) {
        return splittedList.size() == 4;
    }

    private boolean areAllElementsValidNumbers(List<String> splittedList) {
        final var ZERO = 0;

        for (String element : splittedList) {
            try {
                if (this.isFirstNumberZero(element)) {
                    this.validateIfIsValidZero(element);
                }
                Integer.parseInt(element);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private boolean isFirstNumberZero(String element) {
        return element.startsWith("0");
    }

    private void validateIfIsValidZero(String element) {
        if (element.length() > 1) {
            throw new IllegalArgumentException("Onlye '0' is allowed");
        }
    }
}
