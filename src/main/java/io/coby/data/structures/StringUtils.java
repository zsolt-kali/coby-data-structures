package io.coby.data.structures;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class StringUtils {
    public static String reverseString(String input) {
        // check for null

        char[] chars = input.toCharArray();
       char tempChar = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - (i + 1)) {
                tempChar = chars[i];
                chars[i] = chars[chars.length - (i + 1)];
                chars[chars.length - (i + 1)] = tempChar;
            }
        }
        return new String(chars);
    }
}
