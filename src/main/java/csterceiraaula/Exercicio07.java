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
public final class Exercicio07 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio07() {
    }

    /**
     *
     * @param x inteiro para realizar o resto divisao inteira
     * @param y inteiro para realizar o resto divisão inteira
     * @return s restorna o resultado apos os calculos
     */
    public static int restoDivisaoInteira(final int x, final int y) {
        int s = 0;
        if (y < 0 && x < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            s = x;
            while (y <= s) {
                s = s - y;
            }
            return s;
        }
    }
}
