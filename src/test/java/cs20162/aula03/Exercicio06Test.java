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
public class Exercicio06Test {
    
   @Test (expected = IllegalArgumentException.class)
    public void numeroInvalido(){
        Exercicio06.quadradoPerfeito(-5);
    }
    
    @Test
    public void numeroValido(){
        assertEquals(10, Exercicio06.quadradoPerfeito(10));
    }

}


