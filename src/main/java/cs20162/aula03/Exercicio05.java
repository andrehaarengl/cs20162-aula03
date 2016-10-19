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
public class Exercicio05 {

    /**
     *
     * @param x
     * @param y
     * @param k
     * @return c/a
     */
    public static double razaoAurea(int x, int y, int k) {
        int c = 0, a = 0, i = 0, t = 0;
        if (x < 0 && x > y && k < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
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
