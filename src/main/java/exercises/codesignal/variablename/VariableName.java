package exercises.codesignal.variablename;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {

    public static boolean solution(String name) {
        var characters = name.split("");

        try {
            // Check if starts with a number
            Integer.parseInt(characters[0]);
            return false;
        } catch (Exception e) {
            // Check if it has special characters with the exception of underscore
            Pattern specialCharacters = Pattern.compile("[\\s!@#$%&*()+=.|<>?{}\\[\\]~-]");
            Matcher specialCharactersMatcher = specialCharacters.matcher(name);

            return !specialCharactersMatcher.find();
        }
    }
}
