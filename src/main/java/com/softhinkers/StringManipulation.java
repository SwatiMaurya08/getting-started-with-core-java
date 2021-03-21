package com.softhinkers;

import com.sun.javafx.binding.StringFormatter;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/18/2021
 */
public class StringManipulation {

    public static void main(String[] args) {
        String val = "Hello World, we are doing string manupulation";
        String val2 = "hello World!";

        String val3 = "elephant";
        // Reverse the string val 2
        StringBuilder sb = new StringBuilder();
        sb.append(val2);
        System.out.println(sb.reverse());

        //Reverse the string val 2
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(val2);
        System.out.println(stringBuffer.reverse());


        // Reserve the string using for loop
        String rev = "";
        char[] temp = val.toCharArray(); // convert string to char array
        for (int i = val.length() - 1; i >= 0; i--) {
            rev = rev + temp[i];
        }

        System.out.println(rev);

        //compare too
        System.out.println("----------------------------------------------------");
        int bool = val.compareTo(val2);
        System.out.println(bool);
        System.out.println(val2);
        System.out.println(val2.length());
        System.out.println(val2.substring(5));
        System.out.println(val2.substring(4, 7));
        System.out.println(val2.split(" ")[0]);
        System.out.println(val2.split(" ")[1]);
        System.out.println(val2.split("o")[0]);
        System.out.println(val2.split("o")[1]);


        String str = val2.concat(val);
        System.out.println(str);

        str = val2 + val + " Welcome";
        System.out.println(str);

        sb.append(val2);
        sb.append(val);
        sb.append("Hello");
        System.out.println(sb.toString());


       //count  of alphabet in a letter 
        char someChar = 'e';
        int count = 0;

        for (int i = 0; i < val3.length(); i++) {
            if (val3.charAt(i) == someChar) {
                count++;
            }

        }
        System.out.println(count);

    }
}
