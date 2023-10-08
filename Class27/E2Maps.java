package Class27;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(3,"Ali");
        students.put(4,"Marta");
        students.put(5,"Ahmed");
        students.put(6,"Ahmed");
        System.out.println(students);
        students.remove(1233);
        System.out.println(students);
        students.replace(4,"Jamel");
        System.out.println(students);

    }
}
