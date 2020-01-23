package exercises.codeexercises.cesarcipher;

public class CesarCipherDecoder {

    private static final char[] ENGLISH_ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final int CESAR_CIPHER_ROTATOR = 5;

    public String decode(String code) {
        code = code.toLowerCase();
        StringBuilder decodedWord = new StringBuilder();

        char[] lettersOfCode = code.toCharArray();

        for (int i = 0; i < lettersOfCode.length; i++) {
            int letterPosition = findLetterPosition(lettersOfCode[i]);
            decodedWord.append(ENGLISH_ALPHABET[this.getRotatedLetterPositionCesarCipher(letterPosition)]);
        }
        return decodedWord.toString();
    }

    private int getRotatedLetterPositionCesarCipher(int currentPosition) {
        final int ENGLISH_ALPHABET_SIZE = ENGLISH_ALPHABET.length;
        int rotatedPosition = CESAR_CIPHER_ROTATOR + currentPosition;

        return rotatedPosition >= ENGLISH_ALPHABET_SIZE ? rotatedPosition - ENGLISH_ALPHABET_SIZE : rotatedPosition;
    }

    private int findLetterPosition(char letter) {
        for (int i = 0; i < ENGLISH_ALPHABET.length; i++) {
            if (ENGLISH_ALPHABET[i] == letter) {
                return i;
            }
        }
        return 0;
    }
}
