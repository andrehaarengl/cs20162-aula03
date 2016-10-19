/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20162.aula03;

/**
 *
 * @author andre
 */
public class Exercicio08 {

    /**
     *
     * @param n
     * @param i
     * @return r
     */
    public static int raizQuadrada(int n, int i) {
        int r = 1;
        if (n < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
        }
        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }
        return r;
    }
}
