package Class30;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            //System.out.println(10/0);
           // String name=null;
           // name.length();
            int [] arr=new int[-5];
        }catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }
        catch (NullPointerException e){
            System.out.println("Check if you stored the null value in the variable");
        }
        catch (Exception e){
            System.out.println("no null");
        }




    }
}
