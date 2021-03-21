package com.softhinkers;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 3/17/2021
 */
public class MethodOverriding1 {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends MethodOverriding1 {
    public void displayInfo() {
        System.out.println("I am a dog.");
    }


    public static void main(String[] args) {
        MethodOverriding1 methodOverriding1 = new MethodOverriding1();
        methodOverriding1.displayInfo();
        Dog dog = new Dog();
        dog.displayInfo();
    }
}
