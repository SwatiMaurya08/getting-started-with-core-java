package javaproblemsolvingstring;

public class StringSplitLetters {
    public static void main(String[] args) {
        String inputString = "Hello";
        char[] tempString = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(tempString[i] + " ");
        }

    }
}
