package Class26;

import java.util.ArrayList;

public class E5ArrayListVsArrayLinkedList {
    public static void main(String[] args) {
        long startingTime = System.currentTimeMillis();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(numbers.get(100000));
        }


        long    endTime=System.currentTimeMillis();
        long timTook=(endTime-startingTime);
        System.out.println(timTook);



    }
}
