package Class25;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 2; i <= 500; i += 2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
        /*for (int i = 0; i < evenNumbers.size(); i++) {
            if(evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }
        }*/
        evenNumbers.removeIf(x -> x % 5 == 0);
        System.out.println(evenNumbers);
    }}
