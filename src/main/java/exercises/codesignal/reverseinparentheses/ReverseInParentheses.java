package exercises.codesignal.reverseinparentheses;

public class ReverseInParentheses {

    public static String reverseInParentheses(String inputString) {
        char[] chars = inputString.toCharArray();
        int[] openPosStack = new int[chars.length];
        int openPosTop = -1;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                    // Push the index of the open parenthesis onto the stack
                    openPosStack[++openPosTop] = i;
                    break;
                case ')':
                    // Reverse substring from the matching open parenthesis to here
                    if (openPosTop < 0) {
                        throw new IllegalArgumentException("Parenthesis mismatch");
                    }
                    int a, b;
                    for (a = openPosStack[openPosTop--], b = i; a < b; a++, b--) {
                        char swap = chars[a];
                        chars[a] = chars[b];
                        chars[b] = swap;
                    }
            }
        }
        if (openPosTop >= 0) {
            throw new IllegalArgumentException("Parenthesis mismatch");
        }

        // Remove parentheses from output
        int o = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(': case ')':
                    break;
                default:
                    chars[o++] = chars[i];
            }
        }
        return new String(chars, 0, o);
    }
}
