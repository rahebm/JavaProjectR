package Class11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphoneObj = new Phone();
        iphoneObj.brand="Iphone";
        iphoneObj.capacity=120;
        iphoneObj.cameraRes="200mp";

        System.out.println(iphoneObj.brand);
        System.out.println(iphoneObj.capacity);
        System.out.println(iphoneObj.cameraRes);
        iphoneObj.battery();
        iphoneObj.screenSize();
        iphoneObj.processor();

        Phone samsungObj = new Phone();
        samsungObj.brand="Samsung Galaxy";
        samsungObj.capacity=250;
        samsungObj.cameraRes="12mp";
        System.out.println(samsungObj.brand);
        System.out.println(samsungObj.capacity);
        System.out.println(samsungObj.cameraRes);
        samsungObj.battery();
        samsungObj.screenSize();
        samsungObj.processor();

    }
}
