package com.softhinkers;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class StaticVariable {
    public static String myClassVar = "class or static variable";

    public static void main(String[] args) {
        StaticVariable obj = new StaticVariable();
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();


        System.out.println(obj.myClassVar);
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);

        obj2.myClassVar = "Text Changed";

        System.out.println(obj.myClassVar);
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
    }
}
