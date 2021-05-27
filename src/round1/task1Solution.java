package round1;

class task1solution {
    public static String remove(String S) {
        char[] charArray = S.toCharArray();

        int i = 0, j = 0;

        while (i < S.length()) {
            if (charArray[i] == 'B' && (j > 0 && charArray[j - 1] == 'A')) {
                --j;
                ++i;
            } else if (charArray[i] == 'A' && (j > 0 && charArray[j - 1] == 'B')) {
                --j;
                ++i;
            } else if (charArray[i] == 'C' && (j > 0 && charArray[j - 1] == 'D')) {
                --j;
                ++i;
            } else if (charArray[i] == 'D' && (j > 0 && charArray[j - 1] == 'C')) {
                --j;
                ++i;
            } else {
                charArray[j++] = charArray[i++];
            }
        }
        return new String(charArray).substring(0, j);
    }

    public static void main(String[] args) {
        String str = "";

        str = remove(str);
        System.out.printf("The string after removal of 'AB', 'BA', 'CD' and 'DA' is '%s'", str);
    }
}