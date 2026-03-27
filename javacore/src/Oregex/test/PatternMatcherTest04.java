package Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //regex = Regular Expressions, elas foram criadas para você poder pegar determinados padroes dentro de um texto.
        //nesse caso do texto2 o matcher encontra o primeiro regex nos indices 0,1,2 entao o proximo regex começa a partir do indice 3
        //por esse motivo o matcher vai nos retornar os indices 0 e 4.

        //Quantificadores
        // ? Zero ou uma ocorrencia
        // * Zero ou mais
        // + Uma ou mais
        // [n,m] de n a m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0x12F3 0xFF4 0XD5EE 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas/caracteres encontrados");
        while (matcher.find()){
            System.out.print(matcher.start()+"  "+matcher.group()+"  \n");
        }
    }
}
