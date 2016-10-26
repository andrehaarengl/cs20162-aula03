/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csterceiraaula;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class Exercicio10Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        Exercicio10.fibonacci(-5);
    }

    @Test
    public void numeroValido() {
        assertEquals(0, Exercicio10.fibonacci(10));
    }

}
