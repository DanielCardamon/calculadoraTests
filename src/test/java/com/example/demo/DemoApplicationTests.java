package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.calc.Calculadora;

@SpringBootTest
class DemoApplicationTests {
	private Calculadora calculadora = new Calculadora();

	@Test
	void contextLoads() {
		int resultado = calculadora.somar(1, 2);
		Assertions.assertEquals(3,resultado);
		//Assertions.assertEquals(-4,resultado);
	}
	@Test
	void subtrair() {
		int resultado = calculadora.subtrair(10,2);
		Assertions.assertEquals(8,resultado);
		Assertions.assertEquals(12,resultado);
	}

}
