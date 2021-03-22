package interview;

import javax.swing.text.PlainDocument;

public class Polymorphism {
    public void AnimalVoice() {
        System.out.println("The sound of different animals are: ");
    }
}

class Dog extends Polymorphism {
    public void AnimalVoice() {
        System.out.println("The Dog barks");
    }
}
class Pig extends Polymorphism{
    public void AnimalVoice(){
        System.out.println("The Pig says wee wee ");
    }
}
class main{
    public static void main(String[] args ){
        Polymorphism polymorphism = new Polymorphism();
        Polymorphism polymorphism1 = new Dog();
        Polymorphism polymorphism2 = new Pig();

        polymorphism.AnimalVoice();
        polymorphism1.AnimalVoice();
        polymorphism2.AnimalVoice();
    }
}