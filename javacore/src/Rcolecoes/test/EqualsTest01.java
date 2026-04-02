package Rcolecoes.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "João Rocha";
        String nome2 = new String("João Rocha");
        //quando você utiliza == você não compara o valor em si do ojeto, mas sim a referencia
        //para comparar o valor do objeto utiliza-se o .equals();
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }
}
