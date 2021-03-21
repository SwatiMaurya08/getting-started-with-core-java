package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/19/2021
 */
public class StringThrows {
    public static void main(String[] args) throws Exception {
        try {
            int studentRoll = 101;

            if (studentRoll == 101) {
                int num = 5;
                int num1 = 0;
                int num2 = num/num1;
                System.out.println(num2);

            }




        } catch (Exception e) {
            System.out.println("Inside the catch block" +e);
            throw new Exception("Invalid Roll");
        }
    }
}
