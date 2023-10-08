package Class27;

import java.util.LinkedHashMap;

public class Task {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> floors=new LinkedHashMap<>();
        floors.put(1, "Google");
        floors.put(2, "Syntax");
        floors.put(3, "Meta");
        floors.put(4, "Apple");
        floors.put(5, "Street State");
        floors.put(3, "TD");
        floors.put(7, "Bank of America");
        System.out.println(floors);
        System.out.println(floors.size());
        floors.replace(4,"GoldmanSachs");
        floors.remove(7);
        System.out.println(floors);

    }
}
