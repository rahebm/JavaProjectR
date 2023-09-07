package Class16;

public class T1 {

    private String address;

    public T1(String userAddress){
        address = userAddress;
        System.out.println("Executed constructor with parameter "+userAddress);
    }
    public T1(){
        System.out.println("Executed without parameter");
    }

    public static void main(String[] args) {
        new T1();
        new T1("Canada");

    }

}



