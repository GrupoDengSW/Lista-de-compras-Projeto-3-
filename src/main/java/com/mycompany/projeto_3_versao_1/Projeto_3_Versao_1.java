/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_3_versao_1;

/**
 *
 * @author LCPOWER
 */
public class Projeto_3_Versao_1 {

    public static void main(String[] args) {
        Produto p1 = new Produto("Ovo", 3 , 6); 
        Produto p2 = new Produto("Farinha", 5 , 1); 
        Produto p3 = new Produto("Atum", 1 , 2); 
        Produto p4 = new Produto("Esparguete", 7 , 1); 
        
        ListaDeCompras lista = new ListaDeCompras(p1,p2,p3,p4);
        
        lista.consola();
   }
}
