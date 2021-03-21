package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/19/2021
 */
public class StringThrowThrows {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 20;
        int c= a+b;
        System.out.println(c);
        try {
            Thread.sleep(1000);
            throw new Exception("Invalid Exception");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
