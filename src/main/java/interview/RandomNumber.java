package interview;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package interview
 * @date 3/19/2021
 */
public class RandomNumber {
    public static void main(String[] arg) {
        checkEvenOdd(1000);
    }

    private static void checkEvenOdd(int randomIntegerNumbers) {
        int evenCounter = 0;
        int oddCounter = 0;
        // creating the arraylist of integer type for storing integer numbers
        ArrayList<Integer> randomIntegerList = new ArrayList<Integer>();
        //generate a random number
        Random random = new Random();
        for (int loop = 0; loop < randomIntegerNumbers; loop++) {
            randomIntegerList.add(random.nextInt());
        }
        //it prints the number of integer type from randomIntegerList
        for (Integer integer : randomIntegerList) {
            //To check whether the number is even  or odd
            if (integer % 2 == 0) {
                evenCounter++;
                System.out.println(integer + "  number is even ");
            } else {
                System.out.println(integer + " number is odd ");
                oddCounter++;
            }
        }
        // get counts of even and odd
        System.out.println("Even number count is : " + evenCounter);
        System.out.println("Odd number count is : " + oddCounter);
    }
}
