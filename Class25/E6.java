package Class25;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();  //Lambda expression

        words.add("Milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
        words.forEach(x-> System.out.println(x)); //this line is only calling out the words not necessary in this example
        words.removeIf(y->y.contains("e"));
        System.out.println(words);
    }
}
