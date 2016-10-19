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
public class Exercicio05Test {
  
    @Test (expected = IllegalArgumentException.class)
    public void numeroInvalido(){
        Exercicio05.razaoAurea(-1, -2, -1);
    }
    @Test
    public void numeroValido(){
        assertEquals(1.0, Exercicio05.razaoAurea(5, 6, 7), 0.01);
    }
 
}
