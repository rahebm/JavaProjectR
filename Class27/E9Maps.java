package Class27;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOn",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("EyeLiner",25.5);

       Set<Map.Entry<String,Double>> entries= makeup.entrySet();
       for(Map.Entry<String,Double> e:entries){
           System.out.println(e.getKey()+" "+e.getValue());
       }
    var entries1=makeup.entrySet();
       for(var e:entries1){
           System.out.println(e.getKey()+" "+e.getValue());
       }
    }

}
