package exercises.codeexercises.longestcommonsubsequence;

public class LongestCommonSubsequence {

    public String findLongestCommonSubsequenceBetweenTwoWords(String firstWord, String secondWord) {
        String shortestWord = this.findShortestWordBetweenTwoWords(firstWord, secondWord);
        String largestWord = firstWord.equals(shortestWord) ? secondWord : firstWord;

        int startSubstringPosition = 0;
        int endSubstringPosition = 2;
        int shortestWordLength = shortestWord.length();

        String longestSequence = "";

        while (startSubstringPosition < shortestWordLength - 1) {
            while (endSubstringPosition <= shortestWordLength) {
                String sequenceToSearchFor = shortestWord.substring(startSubstringPosition, endSubstringPosition);

                if (largestWord.contains(sequenceToSearchFor)) {
                    longestSequence = longestSequence.length() >= sequenceToSearchFor.length() ?
                            longestSequence : sequenceToSearchFor;
                }
                endSubstringPosition++;
            }

            startSubstringPosition++;
            endSubstringPosition = this.getEndSubstringPositionToHaveAtLeastTwoLetters(startSubstringPosition);
        }

        return longestSequence;
    }

    private int getEndSubstringPositionToHaveAtLeastTwoLetters(int startSubstringPosition) {
        return startSubstringPosition + 2;
    }

    private String findShortestWordBetweenTwoWords(String firstWord, String secondWord) {
        return firstWord.length() <= secondWord.length() ? firstWord : secondWord;
    }
}
