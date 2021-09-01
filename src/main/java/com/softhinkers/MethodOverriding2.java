package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class MethodOverriding2 {
    protected void show()
    {
        System.out.println("Parent's show()");
    }
    public void run(){
        System.out.println("*************");
    }
}

class Child extends MethodOverriding2 {
    public void show1()
    {
        System.out.println("Child's show()");
    }
}


class Main {
    public static void main(String[] args)
    {
//        MethodOverriding2 obj1 = new MethodOverriding2();
//        obj1.show();
//
//
//        MethodOverriding2 obj2 = new Child();
//        obj1.show();
        MethodOverriding2 methodOverriding2 = new Child();
        methodOverriding2.show();
        Child child = new Child();
        child.show();
        child.run();
    }
}
