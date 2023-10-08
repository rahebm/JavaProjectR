package Class24;

import java.util.ArrayList;

public class E1ArrayList { //collections framework
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("Sajana");
        names.add("Avis");
        names.add(1000);
        names.add('F');
        System.out.println(names.size());
        System.out.println(names);
        names.remove(0);
        System.out.println(names.size());
        System.out.println(names);

    }

}
