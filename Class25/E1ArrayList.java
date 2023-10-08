package Class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<String>  names=new ArrayList();
        names.add("Deepali");
        names.add("Ahmad");
        names.add("John");
        names.add("Ali");
        names.add("Bob");
        names.remove(0);
        names.remove(0);
        names.add(0,"Ehab");
        System.out.println(names);
        names.set(1,"Jamel");
        System.out.println(names);
    }
}
