package interview;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package interview
 * @date 3/19/2021
 */
public class StringPalindrome {
    public static void main(String[] args) {
        if (checkPanlindrone("raDaR")) {
            System.out.println("YEEEE");
        }
        checkPanlindrone("Swati");
    }

    public static boolean checkPanlindrone(String input) {
        String word = input;
        String reversedWord = "";

        char[] wordCharArray = word.toCharArray();

        for (int i = (wordCharArray.length) - 1; i >= 0; i--) {
            reversedWord = reversedWord + wordCharArray[i];
        }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(input + " word is palindome");
        } else {
            System.out.println(input + " word is not palindome");
        }

        return word.equalsIgnoreCase(reversedWord);

    }
}

