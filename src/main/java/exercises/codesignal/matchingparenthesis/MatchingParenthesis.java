package exercises.codesignal.matchingparenthesis;

import java.util.Objects;
import java.util.Stack;

public class MatchingParenthesis {

    public boolean isExpressionBalanced(String word) {
        if (Objects.isNull(word) || word.isEmpty()) {
            return false;
        }

        Stack<Character> brackectsStack = new Stack<>();

        char[] characters = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            char element = characters[i];

            if (this.isOpeningBracket(element)) {
                brackectsStack.push(element);
            } else if (element == ']') {
                if (brackectsStack.isEmpty() || !this.isTopStackItemOpeningElement(brackectsStack, '[')) {
                    return false;
                }
            } else if (element == ')') {
                if (brackectsStack.isEmpty() || !this.isTopStackItemOpeningElement(brackectsStack, '(')) {
                    return false;
                }
            } else if (element == '}') {
                if (brackectsStack.isEmpty() || !this.isTopStackItemOpeningElement(brackectsStack, '{')) {
                    return false;
                }
            }
        }
        return brackectsStack.isEmpty();
    }

    private boolean isOpeningBracket(char bracket) {
        return bracket == '[' || bracket == '('
                || bracket == '{';
    }

    private boolean isTopStackItemOpeningElement(Stack<Character> brackectsStack,
                                                 char bracket) {
        return brackectsStack.pop() == bracket;
    }
}
