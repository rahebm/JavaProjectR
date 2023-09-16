package Class22;

public class StringOverview {
    public static void main(String[] args) {
        String phone="Iphone";
      String color=new String();
      color="Yellow";
      String day=new String("Thursday");
      String sentence="       Today is Sept 7     ";
     int size=sentence.length();
        System.out.println(size);

      sentence=sentence.trim();
        System.out.println(sentence);
       String [] words= sentence.split(" ");
        System.out.println(words[2]);
       String modifiedNewString=sentence.replace("Today","Tomorrow");
        System.out.println(modifiedNewString);
        String str1="Hi Hi Friends";
        str1=str1.replace("Hi","Hello");
        System.out.println(str1);
        str1=str1.replaceFirst("Hello", "Bye");
        System.out.println(str1);
        str1=str1.replaceAll("Hello","Bye");
        System.out.println(str1);
        char letter=str1.charAt(2);
        System.out.println(letter);
        int indexOfCharF=str1.indexOf('F');
        System.out.println(indexOfCharF);
    }
}
