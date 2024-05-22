package LAB09.LAB09_Ex03;

import java.util.Objects;

class StringUtils {
    String reverseString(String s) {
        if (s.isEmpty()) throw new IllegalArgumentException("Provided an empty string");

        StringBuilder reversedStr = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedStr.append(s.charAt(i));
        }
        if (Objects.equals(s, reversedStr.toString())) throw new IllegalArgumentException("The input string is the same as output string.");
        return reversedStr.toString();
    }
    String caesarCipher(String s, int offset) {
        StringBuilder cipherResult = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (Character.isLetter(curChar)) {
                char base = Character.isLowerCase(curChar) ? 'a' : 'A';
                cipherResult.append((char) (((curChar - base + offset) % 26) + base));
            } else {
                cipherResult.append(curChar);
            }
        }
        return cipherResult.toString();
    }
    String toLowerCase(String s) {
        if (s.isEmpty()) throw new IllegalArgumentException("Provided an empty string");
        if (Objects.equals(s, s.toLowerCase())) throw new IllegalArgumentException("The provided string is already lowercase.");
        return s.toLowerCase();
    }
    String toUpperCase(String s) {
        if (s.isEmpty()) throw new IllegalArgumentException("Provided an empty string");
        if (Objects.equals(s, s.toUpperCase())) throw new IllegalArgumentException("The provided string is already uppercase.");
        return s.toUpperCase();
    }
}
