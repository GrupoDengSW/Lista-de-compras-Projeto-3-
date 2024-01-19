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
public class ListaDeComprasTest {

    @Test
    public void testPrecoDaLista() {
        Produto p1 = new Produto("Item1", 10, 3);
        Produto p2 = new Produto("Item2", 15, 2);
        Produto p3 = new Produto("Item3", 8, 4);
        Produto p4 = new Produto("Item4", 5, 1);

        ListaDeCompras lista = new ListaDeCompras(p1, p2, p3, p4);

        assertEquals(10 * 3 + 15 * 2 + 8 * 4 + 5 * 1, lista.preçoDaLista());
    }

    @Test
    public void testAddRemoveProdutoPos1() {
        Produto p1 = new Produto("Item1", 10, 3);
        ListaDeCompras lista = new ListaDeCompras(p1, null, null, null);

        lista.addProdutoPos1();
        assertEquals(4, p1.getQuantidade());

        lista.removeProdutoPos1();
        assertEquals(3, p1.getQuantidade());
    }

    @Test
    public void testAddRemoveProdutoPos2() {
        Produto p2 = new Produto("Item2", 15, 2);
        ListaDeCompras lista = new ListaDeCompras(null, p2, null, null);

        lista.addProdutoPos2();
        assertEquals(3, p2.getQuantidade());

        lista.removeProdutoPos2();
        assertEquals(2, p2.getQuantidade());
    }

    @Test
    public void testAddRemoveProdutoPos3() {
        Produto p3 = new Produto("Item3", 8, 4);
        ListaDeCompras lista = new ListaDeCompras(null, null, p3, null);

        lista.addProdutoPos3();
        assertEquals(5, p3.getQuantidade());

        lista.removeProdutoPos3();
        assertEquals(4, p3.getQuantidade());
    }

    @Test
    public void testAddRemoveProdutoPos4() {
        Produto p4 = new Produto("Item4", 5, 1);
        ListaDeCompras lista = new ListaDeCompras(null, null, null, p4);

        lista.addProdutoPos4();
        assertEquals(2, p4.getQuantidade());

        lista.removeProdutoPos4();
        assertEquals(1, p4.getQuantidade());
    }
}
