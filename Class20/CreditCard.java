package Class20;

public class CreditCard {

    public void calcInterest(double balance){
        System.out.println(balance*0.05);

    }
}
class   Visa extends CreditCard {

}
class AX extends CreditCard{
    @Override
    public void calcInterest(double balance) {
        System.out.println(balance*0.07);
    }
}