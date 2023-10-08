package Class27;

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> itemCode=new TreeMap<>();
        itemCode.put(7664847,"Printer");
        itemCode.put(7879885,"TV");
        itemCode.put(7879955,"Copier");
        itemCode.forEach((k,v)->System.out.println(k));
        var codes=itemCode.entrySet();
        for (var c:codes){
            System.out.println(c.getKey()+" "+c.getValue());
        }

    }
}
