package Class21;

public class Animal {  //overriding
    void speak (){
        System.out.println("Animals can speak");
    }
void sleep(){
    System.out.println("Animals sleep");
}
void eat (){
    System.out.println("Animals eat");
}
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff wuff");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow meow");
    }
}