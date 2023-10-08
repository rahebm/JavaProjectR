package Class26;

import java.util.LinkedList;

public class E4ArrayListVsArrayLinkedList {
    public static void main(String[] args) {
        long startingTime=System.currentTimeMillis();

        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 0; i <100000 ; i++) {
            numbers.add(0,i);
        }
        long    endTime=System.currentTimeMillis();
        long timTook=(endTime-startingTime);
        System.out.println(timTook);



    }
}
