package stringmanipulation;


public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {101, 103, 105, 107};
        for (int i = 0; i < numbers.length; i++) {
            int missingNumber = numbers[i] + 1;
            for (int j = 0; j < numbers.length; j++) {
                if (missingNumber != numbers[j]) {
                    System.out.println(missingNumber);
                    break;
                }
            }
        }
        //if number is not present print that missing number

//        int n = numbers.length + 1;
//        int sumOfAll = (n * (n + 1)) / 2;
//        int sumOfArray = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sumOfArray = sumOfArray + numbers[i];
//        }
//        int missingNumber = sumOfAll - sumOfArray;
//        System.out.println("The missing number is:" + missingNumber);
    }
}
