package Class18;

import Class19.Bike;

public class HondaBike extends Bike {//protected access
    void printModel(){
        System.out.println(make);

    }

}
class Tester{
    public static void main(String[] args) {
        Bike b=new Bike();

    }
}
