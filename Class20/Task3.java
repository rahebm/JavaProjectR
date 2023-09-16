package Class20;

public class Task3 {
    private static void print(){
        System.out.println("Java is not easy");
    }
    private static void print(String word){
        System.out.println("Java is "+word);

    }
    private static void print(String word,String word2) {
        System.out.println(word+word2);
    }
    public static void main(String[] args) {
        Task3.print();
        Task3.print("very hard");
        Task3.print("but you can do it");
    }}


