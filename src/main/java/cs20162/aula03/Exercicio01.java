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
public class Exercicio01 {

    /**
     *
     * @param n
     * @return s
     */
    public static double somatorioElementar(int n) {
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
