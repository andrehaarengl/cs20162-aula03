/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20162.aula03;

/**
 *
 * @author aluno
 */
public class Exercicio04 {

    /**
     *
     * @param n
     * @param k
     * @return e
     */
    public static int logaritmoNatural(int n, int k) {
        int i, e = 0, p, f;
        if (n < 1 && k < 2) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = 2;
            e = n + 1;
            while (i <= k) {
                p = potenciaUsandoSomas(n, i);
                f = fatorial(i);
                e = e + p / f;
                i = i + 1;
            }
        }
        return e;
    }

    /**
     *
     * @param x
     * @param y
     * @return potencia
     */
    public static int potenciaUsandoSomas(int x, int y) {
        int potencia = 1;
        int i = 1;
        if (x < 0 && y < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        while (i <= y) {
            potencia = (potencia * x);
            i = i + 1;
        }
        return potencia;
    }

    /**
     *
     * @param n
     * @return f
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
