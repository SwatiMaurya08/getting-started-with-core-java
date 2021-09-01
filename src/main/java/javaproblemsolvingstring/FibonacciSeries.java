package javaproblemsolvingstring;

public class FibonacciSeries {
    public static void main(String[] args) {
        int maxNumber = 20;
        int previousNumber = 0;
        int nextNumber = 1  ;
        for (int i = 1; i <= maxNumber; ++i){
            System.out.print(previousNumber+ " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
/* On each iteration, we are assigning second number
 * to the first number and assigning the sum of last two
 * numbers to the second number
 */

