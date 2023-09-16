package Class22;

public abstract class Animal {//Abstract
   String name;
   String breed;
   String color;

  abstract void speak();
  abstract void sleep();
  abstract void eat();
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("wuff wuff");
    }
    @Override
    void sleep() {
        System.out.println("Sleeping for last 10 hours......");
    }
    @Override
    void eat() {
        System.out.println("Eating bones.....");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow.......");
    }

    @Override
    void sleep() {
        System.out.println("3 hours of sleep");
    }

    @Override
    void eat() {
        System.out.println("eating fish");
    }
}