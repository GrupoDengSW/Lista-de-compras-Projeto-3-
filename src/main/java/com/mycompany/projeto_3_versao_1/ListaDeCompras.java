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
    
    private Produto[] Produtos = new Produto[4]; 
    Scanner scanner = new Scanner(System.in);
    
    public ListaDeCompras(Produto p1 , Produto p2 , Produto p3 , Produto p4) {
        Produtos[0]=p1;
        Produtos[1]=p2;
        Produtos[2]=p3;
        Produtos[3]=p4;
    }
    
    public int preçoDaLista(){
        int total = 0;
        
        for(Produto p : Produtos){
            total = total + p.getValorTotal();
        }
        
        return total;
    }
    
    public void addProdutoPos1(){
        Produtos[0].addQuantidade();
    }
    
    public void addProdutoPos2(){
        Produtos[1].addQuantidade();
    }
    
    public void addProdutoPos3(){
        Produtos[2].addQuantidade();
    }
    
    public void addProdutoPos4(){
        Produtos[3].addQuantidade();
    }
    
    public void removeProdutoPos1(){
        Produtos[0].removeQuantidade();
    }
    
    public void removeProdutoPos2(){
        Produtos[1].removeQuantidade();
    }
    
    public void removeProdutoPos3(){
        Produtos[2].removeQuantidade();
    }
    
    public void removeProdutoPos4(){
        Produtos[3].removeQuantidade();
    }
    
    
    public void consola(){
    
        boolean flagDaConsola = true;
        while ( flagDaConsola) {
            System.out.println("=== Lista de Compras ===");
            System.out.println("--------------------------------");
            for(Produto p : Produtos){
                System.out.printf("| %-2s | %-15s | %-5s |\n", "X", p.getNome(), p.getQuantidade());
            }
            System.out.println("--------------------------------");
            System.out.println("1 - Adicionar Quantidade");
            System.out.println("2 - Remover Quantidade");
            System.out.println("3 - Ver preço total dos itens");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    boolean flag1 = true;
                    while(flag1){
                        System.out.println("1 - " + Produtos[0].getNome() );
                        System.out.println("2 - " + Produtos[1].getNome() );
                        System.out.println("3 - " + Produtos[2].getNome() );
                        System.out.println("4 - " + Produtos[3].getNome() );
                        System.out.print("Escolha uma opção: ");
                        int opcao2 = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcao2) {
                            case 1:
                                Produtos[0].addQuantidade();
                                flag1 = false;
                                break;
                            case 2:
                                Produtos[1].addQuantidade();
                                flag1 = false;
                                break;
                            case 3:
                                Produtos[2].addQuantidade();
                                flag1 = false;
                                break;
                            case 4:
                                Produtos[3].addQuantidade();
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                        
                    }   break;
                case 2:
                    boolean flag2 = true;
                    while(flag2){
                        System.out.println("1 - " + Produtos[0].getNome() );
                        System.out.println("2 - " + Produtos[1].getNome() );
                        System.out.println("3 - " + Produtos[2].getNome() );
                        System.out.println("4 - " + Produtos[3].getNome() );
                        System.out.print("Escolha uma opção: ");
                        int opcao3 = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcao3) {
                            case 1:
                                Produtos[0].removeQuantidade();
                                flag2 = false;
                                break;
                            case 2:
                                Produtos[1].removeQuantidade();
                                flag2 = false;
                                break;
                            case 3:
                                Produtos[2].removeQuantidade();
                                flag2 = false;
                                break;
                            case 4:
                                Produtos[3].removeQuantidade();
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                        
                    }   break;
                case 3:
                    System.out.println("O preço total dos itens é " + this.preçoDaLista());
                    break;
                case 4:
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
