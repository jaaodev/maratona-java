package Kpolimorfismo.test;

import Kpolimorfismo.domain.Computador;
import Kpolimorfismo.domain.Produto;
import Kpolimorfismo.domain.Tomate;
import Kpolimorfismo.service.CalculadorImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Aceri5", 3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Tomate verde", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("----------------");

        CalculadorImposto.calcularImposto(produto);
        CalculadorImposto.calcularImposto(produto2);
    }
}
