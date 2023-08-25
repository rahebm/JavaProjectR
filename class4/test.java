package class4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the boolean value");

        boolean value=scanner.nextBoolean();


        System.out.println("The value is " + value);
        boolean value2=scanner.nextBoolean();
        System.out.println("The value is "+value2);
        scanner.close();
    }
}
