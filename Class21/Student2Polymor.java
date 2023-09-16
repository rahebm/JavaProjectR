package Class21;

public class Student2Polymor {
    public static void main(String[] args) {
        Student2 [] arr={new Student2.SyntaxStudent(),new Student2.CollegeStudent(),new Student2.SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].book();
            arr[i].classes();
            arr[i].id();
        }
    }
}
