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
public final class Exercicio01 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio01() {
    }

    /**
     *
     * @param n inteiro para a realização do somatoio elementar
     * @return s retonar p valor do somatorio elementar
     */
    public static double somatorioElementar(final int n) {
        int i, s = 0, d;
        if (n <= 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = 1;
            s = 0;
            while (i <= n) {
                d = 1 + (i * i);
                s = s + (1 / d);
                i = i + i;
            }
        }
        return s;
    }
}
