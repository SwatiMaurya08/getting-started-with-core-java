package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/19/2021
 */
public class StringTryCatchFinal {
    public static void main(String[] args) throws Exception {
        try{
            int num = 10;
            int num1 = 0;
            int num3 = num/num1;
            System.out.println(num3);
            System.out.println("Inside the try block");

        }catch(Exception e){

            // Actions to be when this exception occurs
            System.out.println("Divide by Zero Error");
            System.out.println("Inside the catch block");
            throw e;


        }finally {
            System.out.println("Inside the finally block");
            System.out.println("Finally block always executes ");
        }
    }

}
