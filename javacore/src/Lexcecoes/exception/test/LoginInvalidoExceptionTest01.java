package Lexcecoes.exception.test;

import Lexcecoes.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String passwordDigitado = sc.nextLine();
        if (!usernameDB.equalsIgnoreCase(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
    }

}
