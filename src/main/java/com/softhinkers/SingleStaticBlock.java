package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class SingleStaticBlock {
    static int num ;
    static  String myStr;

    static {
        num = 97;
        myStr = "Static keyword in Java";
    }
    public static void main(String[] args){
        System.out.println("Value of num :"+ num);
        System.out.println("Value of myStr :"+ myStr);
    }
}
