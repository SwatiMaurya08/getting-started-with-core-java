package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/16/2021
 */
public class LocalVariable {
    public String myVar="instance variable";

    public void myMethod(){
        // local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
    }
    public static void main(String args[]){
        // Creating object
        LocalVariable obj = new LocalVariable();
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}
