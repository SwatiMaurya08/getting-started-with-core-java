package javaproblemsolvingstring;

public class StringOccurencesOfWords {
    public static void main(String[] args) {
        String str = "hello how are you";
        char[] tempStr = str.toCharArray();
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (tempStr[i] == tempStr[j]) {
                    System.out.print(tempStr[j] + " ");
                    break;
                }
            }
        }
    }
}

