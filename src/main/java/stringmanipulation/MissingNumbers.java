package stringmanipulation;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] numberArray = {1, 4, 7, 9};
        // perform (n+1) - n
        for (int index = 0; index < (numberArray.length - 1); index++) {
            int diff = numberArray[index + 1] - numberArray[index];
            // if diff is > 1, then increment 1 until n+1
            if (diff > 1) {
                for (int inc = 1; inc < diff; inc++) {
                    System.out.println(numberArray[index] + inc);
                }
            }
        }
    }
}