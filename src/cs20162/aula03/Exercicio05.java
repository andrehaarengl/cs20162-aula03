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

public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static double razaoAurea(int x, int y, int k) {
        int c = 0, a = 0, i = 0, t = 0;
        if (x >= 0 && x < y && k > 0) {
            c = y;
            a = x;
            i = i;
            while (k >= i) {
                t = c;
                c = c + a;
                a = t;
                i = i + 1;
            }
        } else {

        }

        return c / a;
    }

    public static void main(String[] args) {

        int x, y, k;

        Scanner meuLeitor = new Scanner(System.in);
        x = Integer.parseInt(meuLeitor.nextLine());
        y = Integer.parseInt(meuLeitor.nextLine());
        k = Integer.parseInt(meuLeitor.nextLine());

        razaoAurea(x, y, k);

    }

}
