package stringmanipulation;

public class NumberSwapping {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int temp;

        System.out.println("The number before swap :");
        System.out.println("Number1  : " + number1);
        System.out.println("Number2  : " + number2);


        temp = number1;
        number1 = number2;
        number2 = temp;


        //Without using 3 variable
//        number1 = number1 + number2;
//        number2 = number1 - number2;
//        number1 = number1 - number2;

        System.out.println("The numbers after swapping");
        System.out.println("Number1 : " + number1);
        System.out.println("Number2 : " + number2);
    }
}
