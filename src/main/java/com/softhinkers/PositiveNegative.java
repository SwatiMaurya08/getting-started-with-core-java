package com.softhinkers;

import java.util.Scanner;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class PositiveNegative {
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter the number :");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " number is Positive");
        } else if (num < 0) {
            System.out.println(num + " number is Negative");
        } else {
            System.out.println(num + "number is neither positive nor negative");
        }


    }
}
