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
public class Exercicio08Test {
    
    @Test (expected = IllegalArgumentException.class)
    public void numeroInvalido(){
        Exercicio08.raizQuadrada(-1, -1);
    }
    @Test
    public void numeroValido(){
        assertEquals(2, Exercicio08.raizQuadrada(5, 2));
    }
    
    
}
