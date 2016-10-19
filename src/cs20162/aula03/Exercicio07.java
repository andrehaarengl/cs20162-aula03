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

public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static int restoDivisaoInteira(int x, int y) {
        int s = 0;
        if (y <= 0 && x > 0) {
            while (y <= s) {
                s = s - y;
            }
        } else {

        }

        return s;
    }

    public static void main(String[] args) {

        Scanner meuLeitor = new Scanner(System.in);
        int x = Integer.parseInt(meuLeitor.nextLine());
        int y = Integer.parseInt(meuLeitor.nextLine());
        restoDivisaoInteira(x, y);

    }

}
