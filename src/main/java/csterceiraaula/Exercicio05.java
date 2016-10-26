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
public final class Exercicio05 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio05() {
    }

    /**
     *
     * @param x inteiro para realizar os calculos para a razão aurea
     * @param y inteiro para realizar os calculos para a razão aurea
     * @param k inteiro para realizar os calculos para a razão aurea
     * @return c/a valor a ser retornado apos os calculos
     */
    public static double razaoAurea(final int x, final int y, final int k) {
        int c = 0, a = 0, i = 0, t = 0;
        if (x < 0 && x > y && k < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        c = y;
        a = x;
        i = 1;
        while (k >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c / a;
    }
}
