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
public class Exercicio02 {

    /**
     *
     * @param n
     * @return p
     */
    public static double calculoValorPi(int n) {
        int i, s, d;
        double p = 0;
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = 1;
            s = -1;
            d = -1;
            p = 0;
            while (n >= i) {
                d = d + 2;
                s = -1 * s;
                p = p + 4 * (s / d);
                i = i + 1;
            }
        }
        return p;
    }
}
