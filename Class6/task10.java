package Class6;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int x=0;
            int sum=0;
            do{
                System.out.println("Please Enter the price of item or -1 to terminate");
                x=scanner.nextInt();
                sum=sum+x;
                System.out.println("Your total bill is "+sum);
            }while (x!=-1);

    }}

