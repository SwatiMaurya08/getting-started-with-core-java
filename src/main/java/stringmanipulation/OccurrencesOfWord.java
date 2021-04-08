package stringmanipulation;

public class OccurrencesOfWord {
    public static void main(String argu[]) {
        String str = "beautiful beach";
        char[] tempStr = str.toCharArray();
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (tempStr[i] == tempStr[j]) {
                    System.out.print( tempStr[j] + " ");
                    break;
                }
            }
        }
    }
}
