package class5;

import java.util.Scanner;

public class E11LogicalOperatorsTask {
    public static void main(String[] args) {
//AND && operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int yourNum = scanner.nextInt();


        if (yourNum>=1 && yourNum<10) {
            System.out.println("small");
        } else if (yourNum>=11 && yourNum<100) {
            System.out.println("medium");
        }else if (yourNum>=101 && yourNum<=1000){
            System.out.println("large");
    }

        }}



















