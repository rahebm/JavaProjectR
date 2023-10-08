package Review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Ali");
        names.add("Jamel");
        names.add("Rai");
        names.add("Aya");
        names.add("Jamel");

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.remove(1)); //the element was removed on above code so this will print false. returns boolean.
        System.out.println(names.contains("Jamel")); // this will also return boolean
        System.out.println(names);
        names.removeIf(x->x.equals("Jamel"));
        System.out.println(names);


    }
}
