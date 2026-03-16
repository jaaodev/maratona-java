package Kpolimorfismo.test;

import Kpolimorfismo.domain.Computador;
import Kpolimorfismo.domain.Produto;
import Kpolimorfismo.domain.Tomate;
import Kpolimorfismo.service.CalculadorImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Delli5", 5000);

        Tomate tomate = new Tomate("Tomate Almondega", 23);
        tomate.setDataDeValidade("Data de validade: 23/04/2026");

        CalculadorImposto.calcularImposto(produto);
        CalculadorImposto.calcularImposto(tomate);

        Produto produto2 = new Computador("Aceri7", 7000);

        Tomate tomate2 = new Tomate("Tomate Azul", 13);
        tomate2.setDataDeValidade("Data de validade: 27/03/2026");

        CalculadorImposto.calcularImposto(produto2);
        CalculadorImposto.calcularImposto(tomate2);
    }
}
