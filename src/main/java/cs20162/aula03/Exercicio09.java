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
public class Exercicio09 {

    /**
     *
     * @param x
     * @param g
     * @param ag
     * @return p
     */
    public static int regradhorner(int x, int g, int ag) {
        int p = 0, a = 0, i = 0;
        if (g < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
        }
        p = ag;
        i = g - 1;
        while (i >= 0) {
            p = p * x + Exercicio03.fatorial(ag);
            i = i - 1;
        }
        return p;
    }
}
