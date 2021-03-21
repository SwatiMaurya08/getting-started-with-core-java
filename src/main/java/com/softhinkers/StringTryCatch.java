package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/19/2021
 */
public class StringTryCatch {
    public static void main(String[] args) {
        try{
            Thread.sleep(10000);
            System.out.println("Hello Geeks");
            System.out.println("Inside the try block");
        }catch (Exception e){
            System.out.println("Can't divided by zero");
            System.out.println("In the catch block");
        }

    }
}