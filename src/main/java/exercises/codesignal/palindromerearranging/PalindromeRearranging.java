package exercises.codesignal.palindromerearranging;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

    public boolean palindromeRearranging(String inputString) {
        if (inputString.length() == 1) {
            return true;
        }

        Map<Character, Integer> incidencesOfCharacthers = this.countIncidencesOfCharactersInWord(inputString);

        return isThereOnlyOneWordWithOddLength(incidencesOfCharacthers) || isThereOnlyEvenWords(incidencesOfCharacthers);
    }

    private boolean isThereOnlyEvenWords(Map<Character, Integer> incidencesOfCharacthers) {
        return incidencesOfCharacthers.values()
                .stream()
                .noneMatch(this::isOdd);
    }

    private boolean isThereOnlyOneWordWithOddLength(Map<Character, Integer> incidencesOfCharacthers) {
        return incidencesOfCharacthers.values()
                .stream()
                .filter(this::isOdd)
                .count() == 1;
    }

    public boolean isOdd(int number) {
        return number % 2 > 0;
    }

    private Map<Character, Integer> countIncidencesOfCharactersInWord(String inputString) {
        Map<Character, Integer> incidencesOfCharacters = this.mountHashMapWithCharacters(inputString);

        char[] characters = inputString.toCharArray();

        for (char character : characters) {
            int updatedCount = incidencesOfCharacters.get(character) + 1;

            incidencesOfCharacters.put(character, updatedCount);
        }


        return incidencesOfCharacters;
    }

    private Map<Character, Integer> mountHashMapWithCharacters(String inputString) {
        char[] charactersOfWord = inputString.toCharArray();

        Map<Character, Integer> mapOfCharacters = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            mapOfCharacters.put(charactersOfWord[i], 0);
        }

        return mapOfCharacters;
    }
}
