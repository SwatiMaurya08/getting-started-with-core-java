package stringmanipulation;

public class WordCount {
    public static void main(String[] args) {
        int wordCount = 0;
        String word = "swati";
        for ( int i = 0; i < word.length(); i++) {

        }
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    wordCount++;
                }
            }
        }
        System.out.println(wordCount);
    }
}
