package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        /*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
        Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
        (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
        João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
        Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
        Imprima os dados do programa com as mensagens adequadas.*/

        final int PESO_LIMITE = 50;
        final double VALOR_KILO_EXCEDIDO = 4.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Monitoramento de Pesca");
        System.out.print("Peixe Pescado - Digite o peso: ");
        int pesoPeixePescado = sc.nextInt();
        System.out.print("Peixe Pescado - Digite o valor normal: ");
        double valorPorKiloPeixePescado = sc.nextInt();

        if(pesoPeixePescado <= PESO_LIMITE){
            double valorTotalPeixePescado = pesoPeixePescado * valorPorKiloPeixePescado;
            System.out.println();
            System.out.println("Peso total de peixes pescados [Kg] = " + pesoPeixePescado);
            System.out.println("Preço por kilo de peixe [R$]= " + valorPorKiloPeixePescado);
            System.out.println("Preço total [R$]= " + valorTotalPeixePescado);

        } else if (pesoPeixePescado > PESO_LIMITE) {
            double valorTotalPeixePescado = pesoPeixePescado * valorPorKiloPeixePescado;
            double pesoPeixePescadoExcedido = pesoPeixePescado - PESO_LIMITE;
            double multaPorPesoExcedido = pesoPeixePescadoExcedido * (valorPorKiloPeixePescado + VALOR_KILO_EXCEDIDO);
            System.out.println();
            System.out.println("Peso total de peixes pescados [kg] = " + pesoPeixePescado);
            System.out.println("Preço por kilo de peixe [R$]= " + valorPorKiloPeixePescado);
            System.out.println("Preço total [R$]= " + valorTotalPeixePescado);
            System.out.println();
            System.out.println("Peso Excedido [Kg]= " + pesoPeixePescadoExcedido);
            System.out.println("Multa por excesso de peso [R$]= " + multaPorPesoExcedido);
            System.out.println("Preço total final [R$]= "  + (multaPorPesoExcedido + valorTotalPeixePescado));

            sc.close();
        }
    }
}
