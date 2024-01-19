/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_3_versao_1;

/**
 *
 * @author LCPOWER
 */
public class Produto {
    
    private String nome;
    private int valor;
    private int quantidade;
    
    public Produto(String nome, int valor , int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade ;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
   
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    
    public void addQuantidade(){
        this.quantidade = this.quantidade + 1;
    }
    
    public void removeQuantidade(){
        this.quantidade = this.quantidade - 1;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public int getValorProduto(){
        return this.valor;
    }
    
    public int getValorTotal(){
        return (this.valor * this.quantidade);
    }
    
    
    
    
}
