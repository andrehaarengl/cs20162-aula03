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
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static int quadradoPerfeito(int k) {
        int c, i, q;
        if (k >= 1) {
            i = 1;
            q = 1;
            while (q < k) {
                i = i + 2;
                q = q + i;
            }
        } else {

        }

        return c = k;
    }

    public static void main(String[] args) {
        Scanner meuLeitor = new Scanner(System.in);
        int k = Integer.parseInt(meuLeitor.nextLine());
        quadradoPerfeito(k);

    }

}
