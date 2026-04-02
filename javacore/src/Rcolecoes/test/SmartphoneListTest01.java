package Rcolecoes.test;

import Rcolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("2ABC2", "motorola");
        Smartphone s3 = new Smartphone("3ABC3", "samsung");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (Smartphone s : smartphones) {
            System.out.println(s);
        }
        Smartphone s4 = new Smartphone("2ABC2", "motorola");
        System.out.println(smartphones.contains(s4)); // o contains é um recurso do ArrayList utilzar o .equals() para conferir
                                                        // se determinado objeto já existe na lista
        smartphones.add(0, s4); // no ArrayList eu consigo adicionar um item na lista na posição que eu quiser utilizando o index antes do objeto.
        System.out.println(smartphones);
    }
}
