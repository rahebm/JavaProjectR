package class4;

public class E3NestedIf {
    public static void main(String[] args) {
        double accountBalance=30000;
        if(accountBalance>20000) {
            System.out.println("We can afford a normal Toyota");
            if(accountBalance>50000){
                System.out.println("we can afford luxury cars as well");
            }
        }else {
            System.out.println("We need to save more");
        }
    }
}
