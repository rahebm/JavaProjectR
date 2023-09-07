package Class17;

public class Cat {
    private String breed;
    private int age;
    private double weight;
    private char gender;
    public Cat(String breed, int age, double weight, char gender){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
        this.gender=gender;

    }
    public Cat(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String breed, double weight) {
        this.breed = breed;
        this.weight = weight;

    }
    public Cat() {

    }
    public void printInfo(){
        System.out.println(breed+" "+age+" "+weight+" "+gender+" ");

    }
}
