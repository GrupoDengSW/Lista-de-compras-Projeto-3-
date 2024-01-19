/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_3_versao_1;

import java.util.Scanner;

/**
 *
 * @author LCPOWER
 */
public class ListaDeCompras {
    private Produto[] Produtos = new Produto[10]; 
    Scanner scanner = new Scanner(System.in);
    
    public ListaDeCompras(Produto p1 , Produto p2 , Produto p3 , Produto p4) {
        Produtos[0]=p1;
        Produtos[1]=p2;
        Produtos[2]=p3;
        Produtos[3]=p4;
    }
    
    private int nmrArtigos=4;
    
    public int preçoDaLista(){
        int total = 0;
        
        for(int i = 0; i < this.nmrArtigos ; i++){
            total = total + Produtos[i].getValorTotal();
        }
        
        return total;
    }    
    
    public void consola(){
        boolean flagDaConsola = true;
        while ( flagDaConsola) {
            System.out.println("=== Lista de Compras ===");
            System.out.println("--------------------------------");
            for(int i = 0; i < this.nmrArtigos ; i++){
                System.out.printf("| %-2s | %-15s | %-5s |\n", (Produtos[i].getQuantidade()==0)?"X":"", Produtos[i].getNome(), Produtos[i].getQuantidade());
            }
            System.out.println("--------------------------------");
            System.out.println("1 - Adicionar Quantidade");
            System.out.println("2 - Remover Quantidade");
            System.out.println("3 - Ver preço total dos itens");
            System.out.println("4 - Adicionar Produto");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            scanner.nextLine();
            boolean flag = true;
            switch (opcao) {
                case 1:
                    while(flag){
                        for(int i = 0; i < this.nmrArtigos ; i++){
                            System.out.printf((i+1)+" - %s\n", Produtos[i].getNome());
                        }
                        System.out.print("Escolha uma opção: ");
                        int opcao2 = scanner.nextInt();
                        scanner.nextLine();
                        if(opcao2<=this.nmrArtigos && opcao2>0){  
                            System.out.println("Indique a quantidade: ");
                            int quantidade = scanner.nextInt();
                            scanner.nextLine();
                            Produtos[opcao2-1].addQuantidade(quantidade);
                            flag=false;
                        }else{
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                        
                    }   break;
                case 2:
                    while(flag){
                        for(int i = 0; i < this.nmrArtigos ; i++){
                            System.out.printf((i+1)+" - %s\n", Produtos[i].getNome());
                        }
                        System.out.print("Escolha uma opção: ");
                        int opcao3 = scanner.nextInt();
                        scanner.nextLine();
                        if(opcao3<=this.nmrArtigos && opcao3>0){ 
                            System.out.println("Indique a quantidade: ");
                            int quantidade = scanner.nextInt();
                            scanner.nextLine();
                            Produtos[opcao3-1].removeQuantidade(quantidade);  
                            flag=false;
                        }else{
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                        
                    }   break;
                case 3:
                    System.out.println("O preço total dos itens é " + this.preçoDaLista());
                    break;
                case 4:
                    if (!(this.nmrArtigos<10)){
                        System.out.println("ERRO: Sem espaço na lista!");
                    }else{
                        System.out.println("Digite o nome do produto :");
                        String nome = scanner.nextLine();
                        System.out.println("Quanto custa uma unidade de "+nome+"?");
                        int valor = scanner.nextInt();
                        Produtos[nmrArtigos]=new Produto(nome,valor,1);
                        this.nmrArtigos=this.nmrArtigos+1;
                    }
                    break;
                case 9:
                    flagDaConsola = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Fim do Programa!!!");
    
    }
}
