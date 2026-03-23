package Lexcecoes.exception.test;

import Lexcecoes.domain.Funcionario;
import Lexcecoes.domain.LoginInvalidoException;
import Lexcecoes.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        //No sobrescrita de metodos com exceptions, eu não posso utilizar exceptions mais genericos que os da classe pai
        //Exceções do tipo checked não podem ser declaradas se não tiverem sido declaradas na classe pai
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
