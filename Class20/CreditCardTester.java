package Class20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.calcInterest(100);
        Visa v=new Visa();
    v.calcInterest(100);
    AX ax=new AX();
    ax.calcInterest(100);
    }

}
