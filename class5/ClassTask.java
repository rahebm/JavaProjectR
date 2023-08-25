package class5;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("are you single? true/false");
        Boolean bool1 = input.nextBoolean();
        System.out.println("do you have money? true/false");
        Boolean bool2 = input.nextBoolean();

        if (bool1 && bool2) {
        System.out.println("Get Married");
    }else {
            System.out.println("make more money");

        }
    }}

