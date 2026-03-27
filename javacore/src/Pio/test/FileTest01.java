package Pio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            System.out.println("Created " +file.createNewFile());
            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deleted " +file.delete());
            }
            System.out.println("Created " +file.createNewFile());
            System.out.println("Absolut path" +file.getAbsolutePath());
            System.out.println("Last modified " +new Date(file.lastModified()));
            System.out.println(new Date());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
