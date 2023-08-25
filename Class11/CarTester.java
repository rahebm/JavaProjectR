package Class11;

public class CarTester {
    public static void main(String[] args) {
        Car toyotaObj = new Car();
        toyotaObj.make="Toyota";
        toyotaObj.type="SUV";
        toyotaObj.price=50000;
        toyotaObj.year=2023;
        System.out.println(toyotaObj.make);
        System.out.println(toyotaObj.type);
        System.out.println(toyotaObj.price);
        System.out.println(toyotaObj.year);
        toyotaObj.start();
        toyotaObj.brakes();
        toyotaObj.accelerate();

        Car bmwObj = new Car();
        bmwObj.make="BMW";
        bmwObj.type="SUV";
        bmwObj.price=85000;
        bmwObj.year=2024;
        System.out.println(bmwObj.make);
        System.out.println(bmwObj.type);
        System.out.println(bmwObj.price);
        System.out.println(bmwObj.year);
        bmwObj.start();
        bmwObj.brakes();
        bmwObj.accelerate();

    }
}
