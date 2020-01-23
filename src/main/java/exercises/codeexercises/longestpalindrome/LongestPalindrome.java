package exercises.codeexercises.longestpalindrome;

public class LongestPalindrome {

    public String findLongestPalindromeInWord(String word) {
        String longestPalindrome = "";

        int startSubstringPosition = 0;
        int wordSize = word.length();
        int endSubstringPosition = 2;

        while (startSubstringPosition < wordSize - 1) {
            while (endSubstringPosition <= wordSize) {
                String possiblePalindrom = word.substring(startSubstringPosition, endSubstringPosition);

                if (this.isPalindrome(possiblePalindrom)) {
                    longestPalindrome = possiblePalindrom.length() > longestPalindrome.length() ?
                            possiblePalindrom : longestPalindrome;
                }
                endSubstringPosition++;
            }

            startSubstringPosition++;
            endSubstringPosition = this.getEndSubstringPositionToHaveAtLeastTwoLettersInWord(startSubstringPosition);
        }
        return longestPalindrome;
    }

    private int getEndSubstringPositionToHaveAtLeastTwoLettersInWord(int startSubstringPosition) {
        return startSubstringPosition + 2;
    }

    private boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return reversedWord.equals(word);
    }
}
