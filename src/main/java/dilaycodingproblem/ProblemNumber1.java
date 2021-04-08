package dilaycodingproblem;

import interview.Interfaces;


import java.util.ArrayList;


public class ProblemNumber1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberIntegerList = new ArrayList<Integer>();
        numberIntegerList.add(10);
        numberIntegerList.add(15);
        numberIntegerList.add(3);
        numberIntegerList.add(7);
        numberIntegerList.add(16);
        numberIntegerList.add(1);
        System.out.println(numberIntegerList);

        // numberAdd(numberIntegerList, 17);
        numberAddition(numberIntegerList, 17);
    }

    private static void numberAddition(ArrayList<Integer> numberIntegerList, int num) {
        //take the final given number num = 17
        for (int i = 0; i < numberIntegerList.size(); i++) {
            int resultedNumber = num - numberIntegerList.get(i);
            for (int j = 0; j < numberIntegerList.size(); j++) {
                if (resultedNumber == numberIntegerList.get(j)) {
                    System.out.println(resultedNumber + " " + numberIntegerList.get(i));
                }
            }
        }
        //iterate the given num 17 with the numberIntegerList
        //subtract the numbers from the numberIntegerList from given num = 17
        //then check the resulted number in the numberIntegerList
        //if the resulted number is present in the numberIntegerList print that number
    }

    private static void numberAdd(ArrayList<Integer> numberIntegerList, int number) {
        //take  a number from  arraylist
        for (int num = 0; num < numberIntegerList.size(); num++) {
            //iterate that number with other numbers in the  list
            for (int nums = 0; nums < numberIntegerList.size(); nums++) {
                if (num != nums) {
                    //when the addition of both the number is equals to number 17
                    if (numberIntegerList.get(num) + numberIntegerList.get(nums) == number) {
                        //then print that numbers
                        System.out.println(numberIntegerList.get(num) + "  " + numberIntegerList.get(nums));
                        System.out.println("==========================");
                    }
                }
            }
        }
    }
}
