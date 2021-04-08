package com.softhinkers;

import javax.swing.plaf.IconUIResource;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/19/2021
 */
public class StringLetterCount {
    public static void main(String[] args) {
        String str = "Apple Elephant";
        char str2 = 'p';
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == str2)  {
                count ++;
            }
        }
        System.out.println(count);

    }
}

