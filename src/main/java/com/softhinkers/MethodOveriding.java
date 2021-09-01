package com.softhinkers;

import java.lang.reflect.Method;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class MethodOveriding {
    public void eat()
    {
        System.out.println("Human is eating");
    }
}
class Boy extends MethodOveriding{
    //Overriding method
    public void eat(){
        System.out.println("Boy is eating");
    }
    public static void main( String args[]) {
       MethodOveriding methodOveriding = new Boy();
       MethodOveriding methodOveriding1 = new MethodOveriding();
        Boy obj = new Boy();
        methodOveriding.eat();
        obj.eat();
        methodOveriding1.eat();
    }
}
