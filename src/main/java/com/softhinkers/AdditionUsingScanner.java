package com.softhinkers;

import java.util.Scanner;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class AdditionUsingScanner {
    public static void main(String[] args){
        int num1,num2,sum;
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        //num1 = scanner.nextInt();
        num1 = Integer.parseInt(args[0]);

        System.out.println("Enter the second number");
       // num2 = scanner.nextInt();
        num2 = Integer.parseInt(args[1]);

       // scanner.close();
        sum = num1+num2;
        System.out.println("The addition of two number is :" +sum);

        //System.out.println(args[0]);
    }
}
