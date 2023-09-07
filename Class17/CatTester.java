package Class17;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1=new Cat("British",2,3,'F');
        cat1.printInfo();
        Cat cat2=new Cat("Persian",3,5);
        cat2.printInfo();
        Cat cat3=new Cat("German",3.4);
        cat3.printInfo();
        Cat cat4=new Cat();
        cat4.printInfo();
    }
}
