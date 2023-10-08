package Review09;

class Animal {
    String type;

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println(type + " eats");
    }

    public void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps a lot");
    }
}

class Kitten extends Cat {
    String food;

    public Kitten(String type, String food) {
        super();
        this.type = type;
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println(type + " eats " + food);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Cat();
        animals[1] = new Kitten("kitten1", "milk");
        animals[2] = new Kitten("kitten2", "snacks");
        animals[3] = new Kitten("kitten3", "everything");

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
