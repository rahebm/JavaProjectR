package Class26;

import java.util.HashSet;

public class E2Sets {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
        fruit.forEach(x-> System.out.println(x));
        System.out.println("***************");
        for(String f:fruit){
            System.out.println(f);
        }

    }
}
