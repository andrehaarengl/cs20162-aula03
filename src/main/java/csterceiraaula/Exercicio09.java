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
public final class Exercicio09 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio09() {
    }

    /**
     *
     * @param x inteiro para o calculo de horner
     * @param g inteiro para o calculo de horner
     * @param ag inteiro para o calculo de horner
     * @return p resultado do calculo de horner
     */
    public static int regradhorner(final int x, final int g, final int ag) {
        int p = 0, a = 0, i = 0;
        if (g < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            p = ag;
            i = g - 1;
            while (i >= 0) {
                p = p * x + Exercicio03.fatorial(ag);
                i = i - 1;
            }
        }
        return p;
    }
}
