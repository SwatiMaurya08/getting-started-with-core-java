package javaproblemsolvingstring;

import java.util.Locale;

public class StringReverse {
    public static void main(String[] args) {
        String inputString = "Welcome to the Core Java";
        String outputString = " ";
        char[] tempString = inputString.toCharArray();
        for(int i = inputString.length()-1; i>=0;i--){
           outputString = outputString+tempString[i];
        }
        System.out.println(outputString);

    }
}
