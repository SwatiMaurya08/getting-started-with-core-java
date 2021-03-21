package com.softhinkers;

import java.util.Scanner;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println("The given number is Even");
        else
            System.out.println("The given number is odd77");
    }
}

