package Class23;

public class MoveAbleTester {//Interface
    public static void main(String[] args) {
        MoveAble [] arr={new Car(),new Dog()};
        for (MoveAble a:arr){
            a.move();
            a.wash();
        }
    }
}
