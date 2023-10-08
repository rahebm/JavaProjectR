package Class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E7Exceptions {
    public E7Exceptions() throws FileNotFoundException {
    }

    public static void main(String[] args) {


    }

    void readFile() throws FileNotFoundException {
        read();
    }


    void read() {
        try {
            FileInputStream fis = new FileInputStream("C:/adasas");
        } catch (FileNotFoundException f) {
        }
    }
}