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
public class Exercicio07Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        Exercicio07.restoDivisaoInteira(-1, -1);
    }

    @Test
    public void numeroValido() {
        assertEquals(5, Exercicio07.restoDivisaoInteira(5, 6));
    }

}
