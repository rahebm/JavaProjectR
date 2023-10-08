package Review10;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        String s1= "listen";
        String s2= "silent";

        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean isAnaGram = Arrays.equals(c1, c2);
        System.out.println(isAnaGram);
    }
}
