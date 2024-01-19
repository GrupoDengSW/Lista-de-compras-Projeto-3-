/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.projeto_3_versao_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LCPOWER
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaDeComprasTest {

    @Test
    public void testPreçoDaLista() {
        Produto p1 = new Produto("Ovo", 3, 6);
        Produto p2 = new Produto("Farinha", 5, 1);
        Produto p3 = new Produto("Atum", 1, 2);
        Produto p4 = new Produto("Esparguete", 7, 1);

        ListaDeCompras instance = new ListaDeCompras(p1, p2, p3, p4);

        int expResult = 32;
        int result = instance.preçoDaLista();
        assertEquals(expResult, result);
    }

    @Test
    public void testConsola() {
        Produto p1 = new Produto("Ovo", 3, 6);
        Produto p2 = new Produto("Farinha", 5, 1);
        Produto p3 = new Produto("Atum", 1, 2);
        Produto p4 = new Produto("Esparguete", 7, 1);

        ListaDeCompras instance = new ListaDeCompras(p1, p2, p3, p4);

        // Como testar o método consola? Pode ser complicado testar métodos que envolvem interação com o console.
        // Uma alternativa seria redirecionar a saída do console para um stream e capturar isso no teste,
        // mas isso pode ser um pouco avançado para um teste básico.
    }
}
