package class7;

public class E4NestedLoopsTask6 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++){
            for (int j=1;j<=6;j++) {

                if (i == 2 && j == 3||i==3&&j==3||i==2&&j==4||i==3&&j==4) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();

        }
    }}
