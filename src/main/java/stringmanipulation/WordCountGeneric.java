package stringmanipulation;

public class WordCountGeneric {
    public static void main(String[] args) {
        String str = "swatimaurya";
        int[] counter = new int[256];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            counter[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}
