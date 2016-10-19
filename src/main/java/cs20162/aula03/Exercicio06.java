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
public class Exercicio06 {

    /**
     *
     * @param k
     * @return c = k
     */
    public static int quadradoPerfeito(int k) {
        int c, i, q;
        if (k < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
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
