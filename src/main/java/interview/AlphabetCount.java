package interview;

public class AlphabetCount {
    public static void main(String[] args) {
        String str = "Apple Banana Elephant";
        char str1 = 'a';
        char str2 = 'e';
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1) {
                count++;
            }
            if (str.charAt(i) == str2) {
                count1++;
            }
        }
        System.out.println("a " +  count);
        System.out.println("e "  +  count1);
    }
}
