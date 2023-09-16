package Class24;

public class BankAccountTester { //encapsulation
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Marta",1252,12345678,"user123",
                "Pass123","Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Shawn");
        System.out.println(b.getName());


    }
}
