package Lexcecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException");
        } catch (RuntimeException e) { //EXCEÇÕES MAIS GENERICAS SEMPRE TEM QUE FICAR NO FINAL
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException |
                 FileNotFoundException e) { // utilizando o multi catch em linha não podemos botar uma exceção
            //mais generica na mesma linha
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
