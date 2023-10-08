package Class26;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Canada");
        countries.add("USA");
        countries.add("MEXICO");
        countries.add("ARGENTINA");
        countries.add("GERMANY");
        countries.add("ITALY");
        countries.add("FRANCE");
        countries.add("EGYPT");
        countries.add("SAUDI");
        countries.add("INDIA");
        System.out.println(countries);
        System.out.println();
        for (String c:countries)
            System.out.println(c);
        countries.forEach(x-> System.out.println(x));


    }}

