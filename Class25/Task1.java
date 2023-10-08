package Class25;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Create ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Adding names to the ArrayList
        names.add("John");
        names.add("Mike");
        names.add("Raheb");
        names.add("Ali");
        names.add("Everyone");

        // 1. Check if the ArrayList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);

        // 2. Check if a specific name is present
        String specificName = "Bob";
        boolean containsName = names.contains(specificName);
        System.out.println( specificName + containsName);

        // 3. Find the size of the ArrayList and print all values
        int size = names.size();
        System.out.println("Size" + size);

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}



