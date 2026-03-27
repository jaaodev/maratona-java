package Pio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Folder created? " + isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");

        try {
            boolean fileIsCreated = fileArquivoDiretorio.createNewFile();
            System.out.println("File created? " + fileIsCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean fileIsRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("File renamed? " + fileIsRenamed);

        File diretorioRenamed = new File("folder2");
        boolean diretorioIsRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Directory renamed? " + diretorioIsRenamed);
    }
}
