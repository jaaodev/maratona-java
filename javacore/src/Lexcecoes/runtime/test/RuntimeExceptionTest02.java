package Lexcecoes.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }
    /**
     *
     * @param a
     * @param b é o divisor, não pode ser zero
     * @return a/b
     * @throws IllegalArgumentException caso seja zero
     */
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("O argumento não pode ser 0");
        }
        return a/b;
    }
}
