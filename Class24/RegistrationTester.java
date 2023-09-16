package Class24;

public class RegistrationTester {//encapsulation
    public static void main(String[] args) {
        Registration r=new Registration("rob-123@yahoo.com","abc12345",
                "pass12345");
        System.out.println("Email: "+r.getEmail());
        System.out.println("Username: "+r.getUserName());
        System.out.println("Password: "+r.getPassword());

    }
}
