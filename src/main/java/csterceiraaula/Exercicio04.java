/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csterceiraaula;

/**
 *
 * @author aluno
 */
public final class Exercicio04 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio04() {
    }

    /**
     *
     * @param n inteiro para encontrar o logaritmo
     * @param k inteiro para encontrar o logaritmo
     * @return e retorna o valor
     */
    public static int logaritmoNatural(final int n, final int k) {
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
     * @param x valor para encontrar a potencia usando somas
     * @param y valor para encontrar a potencia usando somas
     * @return potencia
     */
    public static int potenciaUsandoSomas(final int x, final int y) {
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
     * @param n inteiro para descobrir o fatorial
     * @return f resultado do fatorial
     */
    public static int fatorial(final int n) {
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
