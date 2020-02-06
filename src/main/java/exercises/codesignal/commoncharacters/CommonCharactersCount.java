package exercises.codesignal.commoncharacters;

public class CommonCharactersCount {

    public int commonCharacterCount(String s1, String s2) {

        int commonCharacterCount = 0;

        char[] s1Characters = s1.toCharArray();
        char[] s2Characters = s2.toCharArray();

        for (char character : s1Characters) {
            int characterIndexFound = this.findWordCharacterIndex(s2Characters, character);
            if (characterIndexFound >= 0) {
                commonCharacterCount++;
                s2Characters = this.removeFoundCharacterFromWord(characterIndexFound, s2Characters);
            }
        }

        return commonCharacterCount;
    }

    private char[] removeFoundCharacterFromWord(int characterIndexFound, char[] s2Characters) {
        char[] newCharacters = new char[s2Characters.length - 1];
        int indexCounter = 0;
        for (int index = 0; index < s2Characters.length; index++) {
            if (index != characterIndexFound) {
                newCharacters[indexCounter] = s2Characters[index];
                indexCounter++;
            }

        }
        return newCharacters;

    }

    private int findWordCharacterIndex(char[] s2Characters, char character) {
        for (int index = 0; index < s2Characters.length; index++) {
            if (s2Characters[index] == character) {
                return index;
            }
        }

        return -1;
    }
}
