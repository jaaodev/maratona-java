package Kpolimorfismo.test;

import Kpolimorfismo.domain.Computador;
import Kpolimorfismo.domain.Televisao;
import Kpolimorfismo.domain.Tomate;
import Kpolimorfismo.service.CalculadorImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Delli7", 4500);
        Tomate tomate = new Tomate("Tomate vermelho", 10);
        Televisao tv = new Televisao("LG Bacana", 6500);
        CalculadorImposto.calcularImposto(computador);
        CalculadorImposto.calcularImposto(tomate);
        CalculadorImposto.calcularImposto(tv);
    }

    /*
    Computador c = new Computador();
    c é uma variável de referencia do tipo Computador
    e o Objeto que está sendo criado também é do tipo Computador.
    Com o polimorfismo nós podemos fazer um metodo generico e extender a todos os objetos de classes filhas,
    nesse caso para todos os objetos que são produtos.

    Upcasting (ou casting implícito) é a conversão de uma referência de uma subclasse para uma superclasse,
    feita automaticamente pelo Java.
    Downcasting (ou casting explícito) é a conversão de uma referência de uma superclasse para uma subclasse, que precisa ser
    feita de forma explícita pelo programador e pode lançar uma ClassCastException se o objeto não for uma instância da classe destino.
     */

}
