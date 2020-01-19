package exercises.codeexercises.palindrome;

public class PalindromeChecker {

    public boolean isPalindrome(String word) {
        String[] wordLetters = word.split("");
        StringBuilder reversedWord = new StringBuilder();

        for (int i = (wordLetters.length - 1); i >= 0; i--) {
            reversedWord.append(wordLetters[i]);
        }

        return reversedWord.toString().equalsIgnoreCase(word);
    }
}
