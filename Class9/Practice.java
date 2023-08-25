package Class9;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] day = new String[7];


            for (int i = 0; i < day.length; i++) {
                System.out.println("Please enter day " + (i + 1)+" of the week");
                day[i]=scanner.nextLine();
            }
    for (String days:day)    {
        System.out.println(days);
    }

    }}











