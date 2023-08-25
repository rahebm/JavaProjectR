package class4;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class E4NestedIfTask {
    public static void main(String[] args) {
        boolean degree = false;
        double GPA = 3.5;
        if (degree == true) {
            System.out.println("Congratulations");
        }
        if (GPA > 3.5) {
            System.out.println("You are eligible for scholarship");
        } else {
            System.out.println("You should have studied harder");

        }if (degree==false){
            System.out.println("you need to get a degree");
        }

    }
}