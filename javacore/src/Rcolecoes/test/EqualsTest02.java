package Rcolecoes.test;

import Rcolecoes.domain.Smartphone;

public class EqualsTest02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("1ABC1", "iphone");
        //apesar de terem os mesmos valores, os dois objetos referenciam valores em memória distintos.
        System.out.println(s1.equals(s2));
        //agora mesmo com os valores estando em objetos completamente diferentes na memória
        //o metodo equals foi sobrescrito para q retornasse true tendo os valores serialNumber iguais
    }
}
