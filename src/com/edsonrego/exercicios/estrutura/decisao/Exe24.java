package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        /*Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar*/
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Analisador de números");
            System.out.print("Digite o primeiro número: ");
            double numero1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = sc.nextDouble();

            System.out.println("Selecione a operação desejada");
            System.out.println("1. Verificar se o número é PAR ou IMPAR - Digite [A] ");
            System.out.println("2. Verificar se o número é POSITIVO ou NEGATIVO - Digite [B] ");
            System.out.println("1. Verificar se o número é INTEIRO ou DECIMAL - Digite [C] ");
            System.out.print("Digite operação escolhida: ");
            String operacao = sc.next();

            if (operacao.equalsIgnoreCase("A")) {
                if (numero1 % 2 == 0) {
                    System.out.println("O número " + numero1 + " é PAR");
                } else {
                    System.out.println("O número " + numero1 + " é IMPAR");
                }
                if (numero2 % 2 == 0) {
                    System.out.println("O número " + numero2 + " é PAR");
                } else {
                    System.out.println("O número " + numero2 + " é IMPAR");
                }
            } else if (operacao.equalsIgnoreCase("B")) {
                if (numero1 > 0) {
                    System.out.println("O número " + numero1 + " é POSITIVO");
                } else {
                    System.out.println("O número " + numero1 + " é NEGATIVO");
                }
                if (numero2 > 0) {
                    System.out.println("O número " + numero2 + " é POSITIVO");
                } else {
                    System.out.println("O número " + numero2 + " é NEGATIVO");
                }
            } else if (operacao.equalsIgnoreCase("C")) {
                if (Math.round(numero1) == numero1) {
                    System.out.println("O número " + numero1 + " é INTEIRO");
                } else {
                    System.out.println("O número " + numero1 + " é DECIMAL");
                }
                if (Math.round(numero2) == numero2) {
                    System.out.println("O número " + numero2 + " é INTEIRO");
                } else {
                    System.out.println("O número " + numero2 + " é DECIMAL");
                }
            }

            System.out.print("Deseja continuar [s/n] ");
            String opcao = sc.next();

            if (opcao.equalsIgnoreCase("N")) {
                continuar = false;
            } else {
                continuar = true;
            }
        }


        sc.close();
    }
}
