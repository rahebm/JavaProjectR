package Class15;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(getVowel("This world is crazy"));
    }

    private static String getVowel(String str){

        return str.replaceAll("[^aeiouAEIOU]","");


        }

    }