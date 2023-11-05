package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        /*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
        Valide a entrada e permita repetir a operação..*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Simulador de crescimento demográfico");

        boolean continuar = true;

        while (continuar) {
            System.out.print("População cidade A: ");
            double populacao_a = sc.nextDouble();
            while (populacao_a < 0) {
                System.out.print("População cidade A: ");
                populacao_a = sc.nextDouble();
            }

            System.out.print("Taxa crescimento: ");
            double taxa_a = sc.nextDouble();
            while (taxa_a < 0 || taxa_a > 10) {
                System.out.print("Taxa crescimento: ");
                taxa_a = sc.nextDouble();
            }

            System.out.print("População cidade B: ");
            double populacao_b = sc.nextDouble();
            while (populacao_b < 0) {
                System.out.print("População cidade B: ");
                populacao_b = sc.nextDouble();
            }

            System.out.print("Taxa crescimento: ");
            double taxa_b = sc.nextDouble();
            while (taxa_b < 0 || taxa_b > 10) {
                System.out.print("Taxa crescimento: ");
                taxa_b = sc.nextDouble();
            }

            int anos = 0;

            if (populacao_a > populacao_b && taxa_a > taxa_b || populacao_a < populacao_b && taxa_a < taxa_b){
                System.out.println("Não haverá inversão populacional");
            }else {
                if (populacao_a < populacao_b) {
                    while (populacao_a <= populacao_b) {
                        anos += 1;
                        populacao_a = populacao_a * ((taxa_a / 100) + 1);
                        populacao_b = populacao_b * ((taxa_b / 100) + 1);
                    }
                    System.out.println("Vai demorar " + anos + " anos para a população de A passar ou igualar a de B.");
                    System.out.println("A tem " + Math.round(populacao_a) + " habitantes e B terá " + Math.round(populacao_b));
                } else if (populacao_a > populacao_b) {
                    while (populacao_b <= populacao_a) {
                        anos += 1;
                        populacao_a = populacao_a * ((taxa_a / 100) + 1);
                        populacao_b = populacao_b * ((taxa_b / 100) + 1);
                    }
                    System.out.println("Vai demorar " + anos + " anos para a população de B passar ou igualar a de A.");
                    System.out.println("A tem " + Math.round(populacao_a) + " habitantes e B terá " + Math.round(populacao_b));
                }
                }
            System.out.print("Deseja continuar? [S/N] ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        sc.close();
    }
}

