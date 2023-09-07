package Class18;

public class X {
    static String name;
    int age;
void printName(){
    System.out.println(name);
}
}
class Y extends X{
    int price;
   static void printPrice(String name){

    }

}
class Z extends Y{
    public static void main(String[] args) {
        printPrice(name);

    }

}