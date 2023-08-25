package GroupExcercise1;

public class Exercise8 {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 67, 45, 23, 1, 78, 34, 9, 56};

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

