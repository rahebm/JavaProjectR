package Class25;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(100);
        numbers.add(5);
        System.out.println(numbers);
        int sum = 0;
        for (int num : numbers) {
            if (num > 20) {
                sum += num;
            }

            System.out.println("Sum of the numbers: " + sum);

        }

    }}


