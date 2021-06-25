package br.com.alura.tdd.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void shouldSumTwoPositiveNumbersInSomar() {
        Calculadora calculadora = new Calculadora();

        int somado = calculadora.somar(5, 5);
        int somado2 = calculadora.somar(2, 7);

        assertEquals(10, somado);
        assertEquals(9, somado2);
    }
}