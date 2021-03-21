package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class SuperClass {
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}
class Demo extends SuperClass{
    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main( String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
