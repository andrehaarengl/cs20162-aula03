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

public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static int fibonacci(int n) {
        int a = 0, c = 0, i = 0, t;
        if (n >= 0) {
            if (n == 0 || n == 1) {
                return n;
            } else {
            }
            while (n >= i) {
                t = c;
                c = c + a;
                a = t;
                i = i + 1;
            }
        } else {
            
        }
        return c;
    }
    
    public static void main(String[] args) {
        
        Scanner meuLeitor = new Scanner(System.in);
        int n = Integer.parseInt(meuLeitor.nextLine());
        fibonacci(n);
        
    }
    
}
