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
public final class Exercicio08 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio08() {
    }

    /**
     *
     * @param n inteiro para relizar o calculo da raiz quadrada
     * @param i inteiro para relizar o calculo da raiz quadrada
     * @return r resultado apos os calculos da raiz quadrada
     */
    public static int raizQuadrada(final int n, int i) {
        int r = 1;
        if (n < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }
        return r;
    }
}
