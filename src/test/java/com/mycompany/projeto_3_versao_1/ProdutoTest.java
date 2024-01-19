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
    public void testGetNome() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        String expResult = "ProdutoTeste";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNome() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        String nome = "NovoNome";
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }

    @Test
    public void testSetValor() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        int valor = 15;
        instance.setValor(valor);
        assertEquals(valor, instance.getValorProduto());
    }

    @Test
    public void testAddQuantidade() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        int val = 3;
        instance.addQuantidade(val);
        assertEquals(8, instance.getQuantidade());
    }

    @Test
    public void testRemoveQuantidade() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        int val = 2;
        instance.removeQuantidade(val);
        assertEquals(3, instance.getQuantidade());
    }

    @Test
    public void testGetQuantidade() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        int expResult = 5;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetValorProduto() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        int expResult = 10;
        int result = instance.getValorProduto();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetValorTotal() {
        Produto instance = new Produto("ProdutoTeste", 10, 5);
        int expResult = 50;
        int result = instance.getValorTotal();
        assertEquals(expResult, result);
    }
}
