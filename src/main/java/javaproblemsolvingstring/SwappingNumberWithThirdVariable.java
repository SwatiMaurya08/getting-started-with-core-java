package javaproblemsolvingstring;

public class SwappingNumberWithThirdVariable {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        int tempNumber;
        System.out.println("Number before swapping is number1 :  " + number1);
        System.out.println("Number before swapping is number2 :  " + number2);
        tempNumber = number1;
        number1 = number2;
        number2  = tempNumber;
        System.out.println("Number after swapping is number1 :  " + number1);
        System.out.println("Number after swapping is number2 :  " + number2);

    }
}
