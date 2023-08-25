package Class9;

import java.util.Arrays;
import java.util.Scanner;

public class E6ArraysReview {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size=scanner.nextInt();
        int [] number =new int[size];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Please enter the number");
            number[i]=scanner.nextInt();
        }
        System.out.println(("you entered these numbers"));
        System.out.println(Arrays.toString(number));
    }
}
