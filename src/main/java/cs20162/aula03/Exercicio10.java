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
public class Exercicio10 {

    /**
     *
     * @param n
     * @return c
     */
    public static int fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            int a = 0, c = 0, i = 0, t;
            if (n == 0 || n == 1) {
                return n;
            } else {
            }
            i = 2;
            while (n >= i) {
                t = c;
                c = c + a;
                a = t;
                i = i + 1;
            }
            return c;
        }
    }
}
