package Class27;

import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Avis");
        names.add("Adam");
        names.add("John");
        names.add("James");

        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();
        arrayLists.add(names);
        System.out.println(arrayLists);

    }
}
