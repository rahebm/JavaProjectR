package Class16;

public class car {
   private String make;
    private String model;
    private String color;
   private double price;

   car(String cMake, String cModel, String cColor, double cPrize){
       make=cMake;
       model=cModel;
       color=cColor;
       price=cPrize;

   }
   public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price+" ");
    }
void setPrice(double cPrice) {
    price = cPrice;
}
       double getPrice(){
           return price;
    }

}

