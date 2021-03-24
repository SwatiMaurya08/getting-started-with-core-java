package stringmanipulation;

public class PrimeNumbers {

    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 50;
        // get the number - n
        for (int number = firstNumber; number <= lastNumber; number++) {
            boolean notPrime = false;
            // divide the number from 2 to (n-1)
            for (int divide = 2; divide < number - 1; divide++) {
                // if we get reminder 0
                if ((number % divide) == 0) {
                    //it's not a prime number - set notPrime = true
                    notPrime = true;
                }
            }
            if (!notPrime) {
                System.out.println(number);
            }
        }
    }
}
