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

public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static int raizQuadrada(int n, int i) {
        int r = 0;
        if (n > 0) {
            while (i >= 0) {
                r = (r + n / r) / 2;
                i = i - 1;
            }
        } else {

        }

        return r;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner meuLeitor = new Scanner(System.in);
        int n = Integer.parseInt(meuLeitor.nextLine());
        int i = Integer.parseInt(meuLeitor.nextLine());

        raizQuadrada(n, i);

    }

}
