package Pio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);){
            bw.write("O Luffy é um pirata.");
            bw.newLine();
            bw.write("O Naruto é um ninja.");
            bw.newLine();
            bw.write("O Goku é um sayajin.");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}