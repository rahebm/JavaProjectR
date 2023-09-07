package Class17;

public class Person {
   private String name;
   private int age;
   private double weight;
   private char gender;


    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
   public Person(String name, int age, double weight, char gender){
       this.name=name;
       this.age=age;
       this.weight=weight;
       this.gender=gender;

   }
public void printInfo(){
       String name="Giu";
    System.out.println(name+" "+age+" "+weight+" "+gender);
}
}
