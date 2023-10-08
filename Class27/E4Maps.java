package Class27;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOn",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("EyeLiner",25.5);
        //below we are applying different conditions:
        makeup.entrySet().removeIf(x->x.getKey().contains("a"));
        makeup.entrySet().removeIf(x->x.getValue()>30);
        makeup.entrySet().removeIf(x->x.getKey().contains("a")&&x.getValue()>30);
        /*makeup.forEach((k,v)-> System.out.println(k+" "+v));
        makeup.forEach((k,v)-> System.out.println(k));
        makeup.forEach((k,v)-> System.out.println(v));*/
        makeup.forEach((k,v)-> {
            if(k.contains("a")){
            System.out.println(v);
            }
        });
    }
}
