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
public class Exercicio07 {

    /**
     *
     * @param x
     * @param y
     * @return s
     */
    public static int restoDivisaoInteira(int x, int y) {
        int s = 0;
        if (y < 0 && x < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            s = x;
            while (y <= s) {
                s = s - y;
            }
            return s;
        }
    }
}
