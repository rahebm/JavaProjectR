package Class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class E5Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(5);
        System.out.println(numbers);
        LinkedHashSet<Integer> set=new LinkedHashSet<>(numbers);
        System.out.println(set);
        numbers.clear();
        System.out.println(numbers);
        numbers.addAll(set);
        System.out.println(numbers);


    }
}
