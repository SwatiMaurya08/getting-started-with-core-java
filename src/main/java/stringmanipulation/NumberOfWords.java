package stringmanipulation;

public class NumberOfWords {
    public static void main(String[] args) {
        String text = "Hey Hello how are you";
        int countWords = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ')
                countWords++;
        }
        System.out.println("Total number of words in string are: " + (countWords + 1));
    }
}
