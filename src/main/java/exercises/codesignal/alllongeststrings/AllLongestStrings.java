package exercises.codesignal.alllongeststrings;

public class AllLongestStrings {
    public String[] getAllLongestStrings(String[] words) {
        if (words.length == 1) {
            return words;
        }

        StringBuilder largestWords = new StringBuilder();

        int largestWordSize = this.findLargestWordSize(words);

        for (String word : words) {
            if (word.length() == largestWordSize) {
                largestWords.append(word).append(",");
            }
        }

        return largestWords.toString().split(",");
    }

    private int findLargestWordSize(String[] words) {
        int largestWordSize = 0;

        for (int index = 0; index < words.length; index++) {
            int wordLength = words[index].length();

            if (wordLength > largestWordSize) {
                largestWordSize = wordLength;
            }
        }
        return largestWordSize;
    }
}
