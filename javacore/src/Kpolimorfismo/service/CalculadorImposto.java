package Kpolimorfismo.service;

import Kpolimorfismo.domain.Produto;
import Kpolimorfismo.domain.Tomate;

public class CalculadorImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$" + produto.getValor());
        System.out.printf("Imposto a ser pago: R$%.2f", imposto);
        if (produto instanceof Tomate) {  // se ( o produto for uma instancia de referencia de Tomate) Execute {};
            System.out.println();
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
            /*
            Outras formas de fazer esse casting:
            String dataDeValidade = ((Tomate)produto).getDataDeValidade();
            System.out.println(dataDeValidade);
            or
            System.out.println(((Tomate)produto).getDataDeValidade());
             */
            System.out.println(((Tomate)produto).getDataDeValidade());
            System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
            return;
        }
        System.out.println();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -  -");
    }

}
