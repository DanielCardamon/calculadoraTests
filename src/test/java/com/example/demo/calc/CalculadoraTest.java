package com.example.demo.calc;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTest {
	private Calculadora calculadora = new Calculadora();

	@Test
	void somar() {
		int resultado = calculadora.somar(1, 2);
		Assertions.assertEquals(3,resultado);
		Assertions.assertEquals(-4,resultado);
	}

}
