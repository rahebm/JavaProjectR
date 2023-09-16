package Class23;

public interface MoveAble {  //interface
    void move();

    void wash();
}
interface Washable{
    void wash();
}
class Dog implements MoveAble, Washable{
    public void move(){
        System.out.println("Dogs can jump run and can move");
    }
    @Override
    public void wash(){
        System.out.println("You can safely wash a Dog");
    }
}
class Car implements MoveAble, Washable{
    @Override
    public void move(){
        System.out.println("Car can move forward backwards and can go in circles ");
    }
    @Override
    public void wash(){
        System.out.println("We can wash a car");
    }
}