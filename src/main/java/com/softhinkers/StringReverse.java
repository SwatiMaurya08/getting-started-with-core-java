package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/19/2021
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "";

        char temp[] = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + temp[i];
        }
        System.out.println(str2);

    }

}

