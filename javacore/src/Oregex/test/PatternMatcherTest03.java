package Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //regex = Regular Expressions, elas foram criadas para você poder pegar determinados padroes dentro de um texto.
        //nesse caso do texto2 o matcher encontra o primeiro regex nos indices 0,1,2 entao o proximo regex começa a partir do indice 3
        //por esse motivo o matcher vai nos retornar os indices 0 e 4.

        //MetaCaracteres Range
        // []
        String regex = "[a-zA-C]";
        String texto = "abaaba";
        String texto2 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas/caracteres encontrados");
        while (matcher.find()){
            System.out.print(matcher.start()+"  "+matcher.group()+"  \n");
        }
    }
}
