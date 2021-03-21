package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class MultipleStaticBlock {
    static int num;
    static String myStr;

    static {
        System.out.println("Static Block 1");
        num = 68;
        myStr = "Block1";
    }

    static {
        System.out.println("Static Block 2");
        num = 80;
        myStr = "Block2";
    }

    public static void main(String[] args) {
        System.out.println("Value of num :" + num);
        System.out.println("Value of myStr :" + myStr);
    }
}
