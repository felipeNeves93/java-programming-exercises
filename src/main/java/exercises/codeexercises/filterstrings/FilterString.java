package exercises.codeexercises.filterstrings;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public List<String> filterStartWithALetterAndThreeLettersOnly(List<String> words) {
        return words.stream()
                .filter(word -> word.startsWith("a") && word.length() == 3)
                .collect(Collectors.toList());
    }
}
