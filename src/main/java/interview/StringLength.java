package interview;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package interview
 * @date 3/19/2021
 */
public class StringLength {
    public static void main(String[] args) {

        //To find the Length
        String input = "Hello, Welcome to the Core Java";
        int length = input.length();
        System.out.println("The length is : " + length);


        //To concanate the String

        String str = "Hello";
        String str1 = "World";

        String StrCon = str.concat(str1).concat("Welcome");
        System.out.println("The concanated String is : " + StrCon);

        //Compare two String

        String val = "Java Programming";
        String val1 = "Python Programming";

        Boolean bool = val.equals(val1);
       // int input1  = val.compareTo(val1);
        System.out.println("Comparision is : " + bool);




    }
}
