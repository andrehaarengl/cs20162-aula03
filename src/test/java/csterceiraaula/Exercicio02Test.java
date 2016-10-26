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
public class Exercicio02Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {

        Exercicio02.calculoValorPi(-4);
    }

    public void numeroValido() {
        assertEquals(3.14, Exercicio02.calculoValorPi(1000), 0.001d);
    }

}
