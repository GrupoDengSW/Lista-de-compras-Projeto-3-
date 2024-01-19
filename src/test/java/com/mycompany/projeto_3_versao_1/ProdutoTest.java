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
public class ProdutoTest {
    
    @Test
    public void testProdutoCreation() {
        Produto produto = new Produto("TestItem", 5, 2);

        assertEquals("TestItem", produto.getNome());
        assertEquals(5, produto.getValorProduto());
        assertEquals(2, produto.getQuantidade());
    }

    @Test
    public void testSetters() {
        Produto produto = new Produto("Item", 10, 3);

        produto.setNome("UpdatedItem");
        produto.setValor(15);
        

        assertEquals("UpdatedItem", produto.getNome());
        assertEquals(15, produto.getValorProduto());
    }

    @Test
    public void testRemoveQuantidade() {
        Produto produto = new Produto("Item", 10, 3);

        produto.removeQuantidade();

        assertEquals(2, produto.getQuantidade());
    }
    
     @Test
    public void testAddQuantidade() {
        Produto produto = new Produto("Item", 10, 3);

        produto.addQuantidade();

        assertEquals(4, produto.getQuantidade());
    }

    @Test
    public void testGetValorTotal() {
        Produto produto = new Produto("Item", 10, 3);

        assertEquals(30, produto.getValorTotal());
    }
}
        
