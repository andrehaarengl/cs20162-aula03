/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20162.aula03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class Exercicio09Test {
    
   @Test (expected = IllegalArgumentException.class)
   public void numeroInvalido(){
       Exercicio09.regradhorner(-1, -5, -6);
   }
   @Test
   public void numeroValido(){
       assertEquals(1364401920, Exercicio09.regradhorner(10, 10, 11));
   }
   
   
}
