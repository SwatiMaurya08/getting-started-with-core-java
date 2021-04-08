package interview;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package interview
 * @date 3/19/2021
 */
public class StringSwap {
    public static void main(String[] args) {
        String str = "Swati Maurya";
        String[] str1 = str.split(" ");// "Swati" ,"Maurya"
        for (int i = (str1.length) - 1; i >= 0; i--) {
            System.out.print(str1[i] + "  ");
        }
    }
}
