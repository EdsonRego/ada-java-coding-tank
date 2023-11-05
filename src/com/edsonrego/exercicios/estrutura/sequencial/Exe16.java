package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        /*Faça um programa para uma loja de tintas.
        O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
        Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
        e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
        Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("******** CASA DE TINTAS ********");
        System.out.println("****  Calculador de Tintas  ****");

        System.out.print("Informe o tamanho da área a ser pintada: ");
        double areaPintada = sc.nextDouble();

        final double RENDIMENTO = 0.333;
        final double PRECO_POR_LATA_TINTA = 80;

        double quantTintaLitrosNesc = areaPintada * RENDIMENTO;
        System.out.printf("Quantidade de tinta necessária [Lts] = %.2f\n", quantTintaLitrosNesc);

        if (quantTintaLitrosNesc <= 18) {
            System.out.println("Área informada: " + areaPintada + "[m2]");
            System.out.println("Quantidade de latas necessárias: " + 1 + " Lata de 18Lts");
            System.out.printf("Custo total: R$ %.2f", PRECO_POR_LATA_TINTA);

        } else if (quantTintaLitrosNesc > 18) {
            double quantTintaLatas18LAux = quantTintaLitrosNesc / 18;
            double quantTintaLatas18LReal = Math.floor(quantTintaLatas18LAux);
            double quantTintaLatas18L = quantTintaLatas18LReal + 1;
            double custoTotal = quantTintaLatas18L * PRECO_POR_LATA_TINTA;

            System.out.println("Área informada: " + areaPintada + "[m2]");
            System.out.println("Quantidade de latas necessárias: " + quantTintaLatas18L + " Lata de 18Lts");
            System.out.printf("Custo total: R$ %.2f", custoTotal);
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
