package Class27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        ArrayList<Double> priceofMaekup=new ArrayList<>();
        priceofMaekup.add(25.5);
        priceofMaekup.add(30.2);
        priceofMaekup.add(25.2);

        ArrayList<Double> pricesOfFruit=new ArrayList<>();
        pricesOfFruit.add(2.5);
        pricesOfFruit.add(3.99);
        pricesOfFruit.add(4.99);

        ArrayList<Double> pricesOfDairy=new ArrayList<>();
        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

        Map<String, ArrayList<Double>> arrayListMap =new HashMap<>();
        arrayListMap.put("priceOfMakekup",priceofMaekup);
        arrayListMap.put("priceOfFruit",pricesOfFruit);
        arrayListMap.put("priceOfDairy",pricesOfDairy);
        System.out.println(arrayListMap);


    }
}
