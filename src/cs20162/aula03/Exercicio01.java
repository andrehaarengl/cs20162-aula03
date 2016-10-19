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
public class Exercicio01 {

    public static double somatorioElementar(int n) {
        int i = 0, s = 0, d = 0;
        if (n <= 1) {
            i = 1;
            s = 0;
            while (i <= n) {
                d = 1 + (i * i);
                s = s + (1 / d);
                i = i + i;
            }

        } else {
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner meuLeitor = new Scanner(System.in);
        int n = Integer.parseInt(meuLeitor.nextLine());
        somatorioElementar(n);
        System.out.println(somatorioElementar(n));

    }

}
