package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        /*Faça um Programa para uma loja de tintas.
        O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
        Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
        e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros,
        que custam R$ 25,00.
        Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
            a) comprar apenas latas de 18 litros;
            b) comprar apenas galões de 3,6 litros;
            c) misturar latas e galões, de forma que o desperdício de tinta seja menor.
        Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/

        Scanner sc =  new Scanner(System.in);
        System.out.println("******** CASA DE TINTAS ********");
        System.out.println("****  Calculador de Tintas  ****");

        System.out.print("Informe o tamanho da área a ser pintada: ");
        double areaPintada = sc.nextDouble();

        final double RENDIMENTO = 0.1666;
        final double PRECO_POR_LATA_TINTA18L = 80.0;
        final double PRECO_GALAO_TINTA3_6L = 25.0;
        final double FOLGA = 1.1;
        double quantTintaLitrosNesc = areaPintada * RENDIMENTO * FOLGA;
        System.out.printf("Quantidade de tinta necessária [Lts] = %.2f\n", quantTintaLitrosNesc);

        double quantTintaLatas18LAux = quantTintaLitrosNesc / 18 ;
        double quantTintaLatas18LReal = Math.floor(quantTintaLatas18LAux);
        double quantTintaLatas18LFrac = quantTintaLatas18LAux % 1;

        double quantTintaGalaoAux = quantTintaLitrosNesc / 3.6 ;
        double quantTintaGalaoReal = Math.floor(quantTintaGalaoAux);
        double quantTintaGalaoFrac = quantTintaGalaoAux % 1;

        System.out.println();
        if(quantTintaLitrosNesc <= 3.6){
            System.out.println("Área informada: " + areaPintada + "[m2]");
            System.out.println("Galão de 3,6L - Total = " + 1 );
            System.out.printf("Custo total: R$ %.2f" , PRECO_GALAO_TINTA3_6L);
            System.out.println();

        }else if (quantTintaLitrosNesc > 3.6 && quantTintaLitrosNesc < 18 ) {
            double quantGalao = quantTintaGalaoReal + 1;

            System.out.println("Área informada: " + areaPintada + "[m2]");
            System.out.printf("Galão de 3,6L - Total = %.2f\n", quantTintaGalaoReal + 1 );
            System.out.printf("Custo total: R$ %.2f", quantGalao * PRECO_GALAO_TINTA3_6L);

        } else if (quantTintaLitrosNesc == 18) {
            System.out.println("Área informada: " + areaPintada + "[m2]");
            System.out.println("Lata de 18L - Total = " + 1 );
            System.out.printf("Custo total: R$ %.2f" , PRECO_POR_LATA_TINTA18L);
            System.out.println();

        } else if (quantTintaLitrosNesc > 18) {
            double quantTintaLatas18L = quantTintaLatas18LReal;
            double quantGalaoAux = quantTintaLatas18LFrac / 3.6;
            if(quantGalaoAux != 0.0) {
                double quantGalao = Math.ceil((quantTintaLitrosNesc - (quantTintaLatas18L * 18))/3.6);

                System.out.println("Área informada: " + areaPintada + "[m2]");
                System.out.println("Lata de 18L - Total = " + quantTintaLatas18L);
                System.out.printf("Galão de 3,6L - Total = %.2f\n", quantGalao);
                System.out.printf("Custo total - Galões: R$ %.2f\n", quantGalao * PRECO_GALAO_TINTA3_6L);
                System.out.printf("Custo total: Latas 18L R$ %.2f\n", quantTintaLatas18L * PRECO_POR_LATA_TINTA18L);
                System.out.printf("Custo total: R$ %.2f", ((quantGalao * PRECO_GALAO_TINTA3_6L)
                        +(quantTintaLatas18L * PRECO_POR_LATA_TINTA18L)));
            }
        }
        sc.close();
    }
}
