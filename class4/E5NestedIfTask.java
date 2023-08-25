package class4;

public class E5NestedIfTask {
    public static void main(String[] args) {
        double mortgageRate = 5.5;
        double mortgagePrice = 60000;
        if (mortgageRate>4.5) {
            System.out.println("you can't buy a house");
        }
        else {
            System.out.println("You are eligible for house");
        } if (mortgagePrice>50000) {
            System.out.println("take a loan");
        }else System.out.println("Pay cash");

        }

    }
