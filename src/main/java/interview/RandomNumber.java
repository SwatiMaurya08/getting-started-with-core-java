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
        ArrayList<Integer> getIntegerArrayList = checkEvenOdd(1000);
        getLargestNumber(getIntegerArrayList);
    }

    private static ArrayList<Integer> checkEvenOdd(int randomIntegerNumbers) {
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

        return randomIntegerList;
    }

    public static void getLargestNumber(ArrayList<Integer> randomIntegerList) {
        int largeNumberIndex = 0;
        for (int loop = 0; loop < randomIntegerList.size(); loop++) {
            //first we will find the index of 1 number
            int number = randomIntegerList.get(largeNumberIndex);
            //compare it with the others
            for (int i = 0; i < randomIntegerList.size(); i++) {
                if (number < randomIntegerList.get(i)) {
                    //store the index of largest number
                    largeNumberIndex = i;
                    break;
                }
            }
            //repeat step  1,2 and 3 for size of list
        }
        System.out.println(randomIntegerList.get(largeNumberIndex) + " Index: " + largeNumberIndex);
    }

}
