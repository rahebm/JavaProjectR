package Class20;

public class House {
    public void preApproval(){
        System.out.println("get preapproval if you don't have 20%");
    }
}
class buyHouse extends House{
    
}
class bankApproval extends House{
    public void preApproval(){
        System.out.println("if you have preapproval no need for 20%");
    }
}
class HouseTester{
    public static void main(String[] args) {
        new House().preApproval();
        new buyHouse().preApproval();
        new bankApproval().preApproval();
        
    }
}