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
public class Exercicio03 {

    /**
     *
     * @param n
     * @return
     */
    public static int fatorial(int n) {
        int i, f = 0;
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = 2;
            f = 1;
            while (i <= n) {
                f = f * i;
                i = i + 1;
            }
            return f;
        }
    }
}
