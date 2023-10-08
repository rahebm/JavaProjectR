package Review09;

public class Practice5 {


    final String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Practice5 obj = new Practice5();

        String original = "hello";
        String reversedString = obj.reverseString(original);

        System.out.println(reversedString);
    }
}


