package Rcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("DevDojo");
        nomes.add("José");
        nomes.remove(2); // aqui eu estou removendo um item daa lista através do sua posição na lista.
        nomes.remove("João"); // aqui eu estou removendo um item da lista através do valor do objetos, que no caso é uma String "João".

        for (String o : nomes) {
            System.out.println(o);
        }

        System.out.println("--------------------------");

        nomes.add("Rocha");
        for (int i=0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("-------------------------");

        // se você quiser adicionar uma lista de tipos primitivos você precisar utilizar os wrappers
        // o motivo disso é que uma lista só consegue utilizar objetos
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(10);
        listaInteiros.add(100);
        System.out.println(listaInteiros);
        for (Integer i : listaInteiros) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Shamira");
        nomes2.add("Maria");
        nomes2.add("Josefina");
        nomes.addAll(nomes2); // aqui estou adicionando todos os itens da lista nomes2 para a lista nomes.
        System.out.println("list nomes2 = " + nomes2);
        System.out.println("list nomes = " + nomes);
    }
}
