package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        /*Faça um Programa para um caixa eletrônico.
        O programa deverá perguntar ao usuário a valor do saque e
        depois informar quantas notas de cada valor serão fornecidas.
        As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Caixa eletrônico");
        System.out.println("Contador de cédulas");
        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        final double minimoSaque = 1.0;
        final double limiteSaque = 600.0;

        if (saque > minimoSaque && saque <= limiteSaque) {
            //Cálculo notas de 100
            double notas100 = (int) saque / 100;
            System.out.println("Notas de 100 = " + notas100);
            saque = saque - (notas100 * 100);

            //Cálculo notas de 50
            double notas50 = (int) saque / 50;
            System.out.println("Notas de 50 = " + notas50);
            saque = saque - (notas50 * 50);

            //Cálculo notas de 10
            double notas10 = (int) saque / 10;
            System.out.println("Notas de 10 = " + notas10);
            saque = saque - (notas10 * 10);

            //Cálculo notas de 10
            double notas1 = saque;
            System.out.println("Notas de 1 = " + notas1);
        }else {
            System.out.println("Valor de inválido \nMínimo = R$ 1,00 \nMáximo = R$ 600,00 ");
        }

        sc.close();
    }
}
