/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20162.aula03;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static int regradhorner(int x, int g, int ag) {
        int p = 0, a = 0, i = 0;
        if (g >= 1) {
            p = ag;
            i = g - 1;
            while (i >= 0) {
                p = p * x + Exercicio03.fatorial(ag);
                i = i - 1;
            }

        } else {

        }

        return p;
    }

    public static void main(String[] args) {
        Scanner meuLeitor = new Scanner(System.in);
        int x, g, ag;
        x = Integer.parseInt(meuLeitor.nextLine());
        g = Integer.parseInt(meuLeitor.nextLine());
        ag = Integer.parseInt(meuLeitor.nextLine());
        regradhorner(x, g, ag);

    }

}
