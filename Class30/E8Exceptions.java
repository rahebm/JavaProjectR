package Class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E8Exceptions {

    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
             fileInputStream = new FileInputStream("C:\\Users\\Raheb\\Desktop\\Employees.xlsx");

        }catch (FileNotFoundException f) {
            System.out.println("Please check the file path");
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e){
                System.out.println(e);
            }

    }
}}