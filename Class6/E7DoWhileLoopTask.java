package Class6;

import java.util.Scanner;

public class E7DoWhileLoopTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;

        System.out.println("Please Enter a number or -1 to terminate");
        input =scanner.nextInt();
        System.out.print("You have entered "+input);

        while (input != -1) {
            System.out.println("Please Enter a number or -1 to terminate");
            input = scanner.nextInt();
            System.out.print("You have entered " + input);

        }



    }}

