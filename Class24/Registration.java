package Class24;

public class Registration { //encapsulation
   private String email;
   private String userName;
   private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    public String getEmail(){
        return email;

    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    void setEmail(String email) {
        if (email.contains("yahoo")){
            this.email = email;
    }else {
            System.out.println("not valid email");
        }
}
void setUserName(String userName){
        if(!userName.isEmpty()&& password.length()>6&& password!=userName) {
            this.userName = userName;
        }else {
            System.out.println("pasword does not meet the requirements");
    }}
void setPassword (String password){
        this.password=password;
}
}

