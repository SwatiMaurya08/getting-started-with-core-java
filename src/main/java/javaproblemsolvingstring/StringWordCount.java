package javaproblemsolvingstring;

public class StringWordCount {
    public static void main(String[] args) {
        String inputString = "Hello Good Morning Everyone";
        int countWords = 0;
        for (int i = 0; i < inputString.length()-1; i++) {
            if (inputString.charAt(i) == ' ' && inputString.charAt(i+1) != ' ') {
                countWords++;
            }
        }
        System.out.println(countWords + 1);
    }
}
