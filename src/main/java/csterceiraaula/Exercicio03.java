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
public final class Exercicio03 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio03() {
    }

    /**
     *
     * @param n valor a ser realizado o fatorial
     * @return retorna o valor do fatorial
     */
    public static int fatorial(final int n) {
        int i, f = 0;
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = 2;
            f = 1;
            while (i <= n) {
                f = f * i;
                i = i + 1;
            }
            return f;
        }
    }
}
