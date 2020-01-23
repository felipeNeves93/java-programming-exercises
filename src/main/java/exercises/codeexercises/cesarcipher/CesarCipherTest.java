package exercises.codeexercises.cesarcipher;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CesarCipherTest {

    CesarCipherDecoder cesarCipher = new CesarCipherDecoder();

    @Test
    public void decode_felipe_ifCodeIsAzgdkz() {
        final String EXPECTED_VALUE = "felipe";
        final String STRING_TO_DECODE = "azgdkz";

        String decodedString = cesarCipher.decode(STRING_TO_DECODE);
        assertEquals(EXPECTED_VALUE, decodedString);
    }
}
