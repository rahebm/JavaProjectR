package class4;

public class E2NestedIf {
    public static void main(String[] args) {

boolean winter=true;
String jacketColor="black";
if (winter==true){  //this condition is true but we have another condition below which is not matching the true value.
    System.out.println("Its Very cold");
   if (jacketColor.equals("Red")) {
       System.out.println("lets go with Red Nike shoes");
   } else {
       System.out.println("lets go with the blue ones");
   }
} else {
    System.out.println(" No need to wear jackets");


}
    }
}
