/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20162.aula03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class Exercicio03Test {
    
   @Test (expected = IllegalArgumentException.class)
   public void numeroInvalido(){
       Exercicio03.fatorial(-1);
   }
   
   @Test
   public void numeroValido(){
       assertEquals(3628800, Exercicio03.fatorial(10));
   }
}
