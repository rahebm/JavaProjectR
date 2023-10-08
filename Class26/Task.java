package Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        HashSet<String> aList1=new HashSet<>(aList);
        aList.clear();
        aList.addAll(aList1);
        System.out.println(aList1);


    }
}
