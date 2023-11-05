package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        /*Faça um programa que pergunte o preço de três produtos
        e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Recomendador para compra de produtos");

        System.out.print("Qual o preço do produto A ? ");
        double preco1 = sc.nextDouble();
        System.out.print("Qual o preço do produto B ? ");
        double preco2 = sc.nextDouble();
        System.out.print("Qual o preço do produto C ? ");
        double preco3 = sc.nextDouble();

        if(preco1 < preco2 && preco1 < preco3){
            System.out.printf("Você deve comprar o produto A, que tem o custo de R$ %.2f ", preco1);
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.printf("Você deve comprar o produto B, que tem o custo de R$ %.2f ", preco2);
        }else if (preco3 < preco1 && preco3 < preco2){
            System.out.printf("Você deve comprar o produto C, que tem o custo de R$ %.2f ", preco3);
        }else {
            System.out.println("Você pode comprar qualquer um dos 3 produtos, pois estão com o mesmo preço!");
        }
        sc.close();
    }
}
