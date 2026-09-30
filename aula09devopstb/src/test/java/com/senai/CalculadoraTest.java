package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
   // Anotação para dizer que é uma função de teste
   @Test 
   void testarSoma(){
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.somar(3, 2);

    // metodo assert Equals compara o resultado que esperamos com o resultado real
    assertEquals(6,resultado);
   }
    
}


