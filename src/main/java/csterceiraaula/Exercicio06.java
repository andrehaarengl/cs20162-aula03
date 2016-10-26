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
public final class Exercicio06 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio06() {
    }

    /**
     *
     * @param k inteiro para ser calculado no quadrado perfeito
     * @return c = k retorno apos os calculos
     */
    public static int quadradoPerfeito(final int k) {
        int c, i, q;
        if (k < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        i = 1;
        q = 1;
        while (q < k) {
            i = i + 2;
            q = q + i;
        }
        return c = k;
    }
}
