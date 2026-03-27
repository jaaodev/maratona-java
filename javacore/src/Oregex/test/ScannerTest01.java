package Oregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Naruto, Sasuke, Hinata, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
