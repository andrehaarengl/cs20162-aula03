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
import java.util.Scanner;

public class Exercicio02 {

    public static double calculoValorPi(int n) {
        int i, s, d;
        double p = 0;
        if (n >= 1) {
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

        } else {

        }

        return p;
    }

    public static void main(String[] args) {

        Scanner meuLeitor = new Scanner(System.in);

        int n = Integer.parseInt(meuLeitor.nextLine());
        calculoValorPi(n);

    }

}
