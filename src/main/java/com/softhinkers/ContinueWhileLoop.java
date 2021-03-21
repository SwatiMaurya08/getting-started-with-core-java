package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class ContinueWhileLoop {
    public static void main(String args[]){
        int counter=10;
        while (counter >=0)
        {
            if (counter==7)
            {
                counter--;
                continue;
            }
            System.out.print(counter+" ");
            counter--;
        }
    }
}
