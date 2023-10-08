package Class25;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("apple");
        words.add("banana");
        words.add("pineapple");
        words.add("kiwi");
        System.out.println(words);
    words.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(words);
    }
}
