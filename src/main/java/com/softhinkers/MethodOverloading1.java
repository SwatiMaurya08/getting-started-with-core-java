package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class MethodOverloading1 {
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
        System.out.println(c );
    }

    public static void main(String args[])
    {
        MethodOverloading1 obj = new MethodOverloading1();
        obj.disp('a');
        obj.disp(5);
    }
}
