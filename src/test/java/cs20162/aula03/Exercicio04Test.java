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
public class Exercicio04Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoLogNatu() {
        Exercicio04.logaritmoNatural(0, 1);
    }

    @Test
    public void numeroValidoLogNatu() {
        assertEquals(18, Exercicio04.logaritmoNatural(5, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorValido() {
        Exercicio04.potenciaUsandoSomas(-1, -2);
    }

    @Test
    public void numeroCorreto() {
        assertEquals(16, Exercicio04.potenciaUsandoSomas(2, 4));
    }

    public class Exercicio03Test {

        @Test(expected = IllegalArgumentException.class)
        public void numeroInvalido() {
            Exercicio04.fatorial(-1);
        }

        @Test
        public void numeroValido() {
            assertEquals(3628800, Exercicio04.fatorial(10));
        }
    }

}
