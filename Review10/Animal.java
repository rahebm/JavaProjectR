package Review10;

public class Animal {
    void speak(){
        System.out.println("Animals Speak");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like to Eat free fish from Giulia");
    }
}