package LAB13.LAB13_Ex02;

class CaesarCipher {
    static String caesarCipher(String s, int offset) {
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

    static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
