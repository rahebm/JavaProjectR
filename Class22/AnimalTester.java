package Class22;

public class AnimalTester {
    public static void main(String[] args) {//Abstract
        Animal[]arr={new Cat(),new Dog()};
        for(Animal a:arr){
            a.speak();
            a.eat();
            a.sleep();
        }
    }
}
