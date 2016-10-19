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
public class Exercicio01Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        
        Exercicio01.somatorioElementar(-1);

    }

    @Test
    public void testMain() {
        //
        assertEquals(0, Exercicio01.somatorioElementar(2), 0.001d);
    }

}
