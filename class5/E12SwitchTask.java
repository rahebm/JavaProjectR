package class5;

import java.util.Scanner;

public class E12SwitchTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your country");
        String country = input.nextLine();
        switch (country){
            case "US":
                System.out.println("English");
                break;
            case "Germany":
                System.out.println("German");
                break;
            case "Japan":
                System.out.println("Japanese");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
