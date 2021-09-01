package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class MethodOverloading {

    public void myMethod(int num) {
        System.out.println(num);
    }

    public void myMethod(int num, char str) {
        System.out.println(num + " " + str);
    }


    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.myMethod(4);
        methodOverloading.myMethod(5, 'S');
    }
}
