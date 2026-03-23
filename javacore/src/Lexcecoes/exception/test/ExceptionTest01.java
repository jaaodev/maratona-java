package Lexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
            //Evite colocar regras de negócio dentro do catch
            //aqui é exclusivo para exceções
            /*
            Unchecekd (RuntimeException e as suas subclasses) = erro no código
            (você deu mole, foi garoto, garoteou, brincou em serviço)
            Checked =   (Exception, IOException e as suas subclasses) = erro fora do código (parabéns).
            Exemplo: FileNotFoundException (O arquivo que você pediu não existe no disco).
             */
        }
    }
}
