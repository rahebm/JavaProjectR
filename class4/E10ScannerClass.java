package class4;

import java.util.Scanner;

public class E10ScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String name=scanner.nextLine();
        if(name.equals("Jamel")) {
            System.out.println("Senior SDET in 2 Years");
        }else if(name.equals("Habib")) {
            System.out.println("jailed by wife");
        }else if(name.equals("Guilia")){
            System.out.println("Dental Assistance");

        }

    }
}
