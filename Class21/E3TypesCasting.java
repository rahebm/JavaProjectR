package Class21;

public class E3TypesCasting {
    public static void main(String[] args) {
        Student s1=new Student("Aslan","A123");
        Student s2=new Student("Mike","B1234");
        Student[]arr={s1,s2};
       // arr[1].printInfo();
        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];
            s.printInfo();

        }
int num=(int)12.5;
        System.out.println(num);
        double age=10;
        Animal a= new Dog();
        Dog d=(Dog)new Animal();
    }

}
