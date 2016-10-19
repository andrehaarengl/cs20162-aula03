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
public class Exercicio02Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        
        Exercicio02.calculoValorPi(-5);
    }

    public void numeroValido() {
        assertEquals(4.0, Exercicio02.calculoValorPi(10));
    }

}
