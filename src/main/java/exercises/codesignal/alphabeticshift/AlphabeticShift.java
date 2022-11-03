package exercises.codesignal.alphabeticshift;

import java.util.HashMap;
import java.util.Map;

public class AlphabeticShift {

    public String alphabeticShift(String inputString) {
        StringBuilder resultString = new StringBuilder();

        Map<String, String> letters = new HashMap<>();
        letters.put("a", "b");
        letters.put("b", "c");
        letters.put("c", "d");
        letters.put("d", "e");
        letters.put("e", "f");
        letters.put("f", "g");
        letters.put("g", "h");
        letters.put("h", "i");
        letters.put("i", "j");
        letters.put("j", "k");
        letters.put("k", "l");
        letters.put("l", "m");
        letters.put("m", "n");
        letters.put("n", "o");
        letters.put("o", "p");
        letters.put("p", "q");
        letters.put("q", "r");
        letters.put("r", "s");
        letters.put("s", "t");
        letters.put("t", "u");
        letters.put("u", "v");
        letters.put("v", "w");
        letters.put("w", "x");
        letters.put("x", "y");
        letters.put("y", "z");
        letters.put("z", "a");

        String[] splittedString = inputString.split("");

        for (String letter : splittedString) {
            resultString.append(letters.get(letter));
        }
        return resultString.toString();
    }
}
