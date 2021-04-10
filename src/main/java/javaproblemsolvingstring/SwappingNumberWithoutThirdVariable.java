package javaproblemsolvingstring;

public class SwappingNumberWithoutThirdVariable {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println("Number before swapping is number1 :  " + number1);
        System.out.println("Number before swapping is number2 :  " + number2);

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Number after swapping is number1 :  " + number1);
        System.out.println("Number after swapping is number2 :  " + number2);


    }
}
