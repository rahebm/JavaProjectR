package Class25;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> softDrinks = new ArrayList<>();

        // Add soft drinks to the ArrayList
        softDrinks.add("Coke");
        softDrinks.add("Pepsi");
        softDrinks.add("Sprite");
        softDrinks.add("Fanta");
        softDrinks.add("Mountain Dew");
        System.out.println(softDrinks);

        // Iterate through the ArrayList and replace drinks with "a" or "e" with "water"
        for (int i = 0; i < softDrinks.size(); i++) {
            String drink = softDrinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                softDrinks.set(i, "Water");
            }
        }
        System.out.println(softDrinks);

        }
    }


