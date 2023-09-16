package Class21;

public class Student2 {
    void book (){
        System.out.println("buy your own books");
    }
    void classes (){
        System.out.println("Classes are online");
    }
    void id (){
        System.out.println("Always have IDs on you");
    }
    static class SyntaxStudent extends Student2{
        @Override
        void book (){
            System.out.println("you don't need books");
        }
    }
    static class CollegeStudent extends Student2{
        @Override
        void classes (){
            System.out.println("some classes are in person");
        }
    }
    static class SchoolStudent extends Student2{
        @Override
        void id (){
            System.out.println("no ID required");
        }
    }
}
