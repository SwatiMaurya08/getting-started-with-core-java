package interview;


public abstract class Abstractions {

    public abstract void AnimalSound();
    public abstract void AnimalType();

    public void sound() {
        System.out.println("The sounds of animals");
    }
}
class Cat extends Abstractions{

    @Override
    public void AnimalSound() {
        System.out.println("Cat says meow meow");
    }

    @Override
    public void AnimalType() {
        System.out.println("The cat is a omnivorous animal");
    }

    @Override
    public void sound(){
        System.out.println("The different animals have different sounds");
    }
}
class main1{
    public static void main(String[] args){
        Abstractions abstractions = new Cat();
        Cat cat = new Cat();
        abstractions.AnimalSound();
        abstractions.AnimalType();
        abstractions.sound();
    }
}
