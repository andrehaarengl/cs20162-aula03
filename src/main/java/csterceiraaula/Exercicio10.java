/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csterceiraaula;

/**
 *
 * @author andre
 */
public final class Exercicio10 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio10() {
    }

    /**
     *
     * @param n inteiro para fazer o fibonacci
     * @return c retorna o resultado do fibonacci
     */
    public static int fibonacci(final int n) {

        if (n < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            int a = 0, c = 0, i = 0, t;
            if (n == 0 || n == 1) {
                return n;
            }
            i = 2;
            while (n >= i) {
                t = c;
                c = c + a;
                a = t;
                i = i + 1;
            }
            return c;
        }
    }
}
