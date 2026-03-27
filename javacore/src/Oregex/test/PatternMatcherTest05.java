package Oregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // ^ negação, [âbc} -> vai mostrar tudo q não for a, b ou c
        String regex = "([a-zA-Z0-9\\._-])+@[a-zA-Z]+(\\.([a-zA-Z])+)+";
        String texto = "naruto@hotmail.com, 123luffy@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, hinata@mail";
        System.out.println("Email válido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        System.out.println(texto.split(",")[2].trim());
        System.out.println("-----------------------------------------");
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
