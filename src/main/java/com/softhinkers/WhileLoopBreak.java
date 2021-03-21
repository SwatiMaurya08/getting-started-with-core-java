package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class WhileLoopBreak {
    public static void main(String args[]){
        int num =0;
        while(num<=100)
        {
            System.out.println("Value of variable is: "+num);
            if (num==2)
            {
                break;
            }
            num++;
        }
        System.out.println("Out of while-loop");
    }
}
