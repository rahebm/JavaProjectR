package Class30;

import java.io.FileInputStream;
import java.io.IOException;

public class E9Exceptions {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Raheb\\Desktop\\Employees.xls")){

        }catch (IOException f){
            System.out.println("please check the file path");

            }

    }
}