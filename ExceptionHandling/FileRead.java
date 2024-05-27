package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        String src = "/home/sarbada/Desktop/abc.txt";
        try {
            fis = new FileInputStream(src);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
