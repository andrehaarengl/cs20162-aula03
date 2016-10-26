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
public final class Exercicio02 {

    /**
     * valor fixo da formula.
     */
    public static final int QUATRO = 4;

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio02() {
    }

    /**
     *
     * @param n nomero a ser calculado
     * @return p
     */
    public static double calculoValorPi(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }

        int i = 1;
        int s = -1;
        int d = -1;
        double p = 0;

        while (n >= i) {
            d += 2;
            s *= -1;
            p = p + QUATRO * s / d;
            i++;
        }

        return p;
    }
}
