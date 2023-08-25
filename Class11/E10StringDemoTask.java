package Class11;

public class E10StringDemoTask {
    public static void main(String[] args) {

        String userName="Johnadam";
        String password="John12345";
        String confirmPass="John12345";
        if(userName.isEmpty()||password.isEmpty()){
            System.out.println("User and Password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if (!password.equals(confirmPass)){
            System.out.println("Password do not match");

        }else {
            System.out.println("Your username and password has been created");
        }



}}
