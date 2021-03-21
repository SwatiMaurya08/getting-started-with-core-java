package interview;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package interview
 * @date 3/19/2021
 */
public class StringReverse {
    public static void main(String[] args) {
        String input = "Swati Maurya";
        char[] ch = input.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {

            System.out.print(ch[i]);
        }


    }
}