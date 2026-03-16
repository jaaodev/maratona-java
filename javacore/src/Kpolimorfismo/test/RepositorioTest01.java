package Kpolimorfismo.test;

import Kpolimorfismo.repositorio.Repositorio;
import Kpolimorfismo.service.RepositorioArquivo;
import Kpolimorfismo.service.RepositorioBancoDeDados;
import Kpolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorioB = new RepositorioBancoDeDados();
        repositorioB.salvar();

        Repositorio repositorioA = new RepositorioArquivo();
        repositorioA.salvar();

        Repositorio repositorioM = new RepositorioMemoria();
        repositorioM.salvar();

        /*
        Programação Orientada a interfaces.
        Dessa forma eu consigo usar Repositorio que é uma interface para criar a variavel de referencia, depois
        eu só referencio ela a um novo objeto do tipo RepositorioBancoDeDados, RepositorioArquivo ou RepositorioMemoria que são
        classes com a interface implementada.
         */

        List<String> list = new LinkedList<>();
        list.add("Naruto");
        list.add("Kakashi");
        list.add("Jiraya");
        System.out.print("Lista: ");
        System.out.println(list);
        /*
        A list<> list também é uma interface onde você pode criar um novo objeto do tipo ArratList<>();, LinkedList<>(); etc...
         */
    }
}
