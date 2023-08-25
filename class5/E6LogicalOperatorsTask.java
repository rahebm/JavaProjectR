package class5;

import java.util.Scanner;

public class E6LogicalOperatorsTask {
    public static void main(String[] args) {
//OR(||) operator
        Scanner input = new Scanner(System.in);
        System.out.println("what is your birt month");
        String month = input.nextLine();
        if (month.equals("January") || month.equals("February") || month.equals("March")) {
        System.out.println("you are born in winter");

    }else if(month.equals("April")||month.equals("May")||month.equals("June")){
            System.out.println("you are born in spring");

        }else if (month.equals("July")||month.equals("August")||month.equals("Sept")){
            System.out.println("you are born on summer");
        }


}}











