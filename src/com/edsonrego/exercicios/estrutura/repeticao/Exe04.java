package com.edsonrego.exercicios.estrutura.repeticao;

public class Exe04 {
    public static void main(String[] args) {
        /*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
        e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
        Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou
        iguale a população do país B, mantidas as taxas de crescimento.*/

        double populacao_a = 80000;
        double populacao_b = 2001000;
        int anos = 0;

        while (populacao_a <= populacao_b) {
            anos += 1;
            populacao_a = populacao_a * 1.03;
            populacao_b = populacao_b * 1.015;
        }
        System.out.println("Demorou " + anos + " anos para a população de A passar ou igualar a de B.");
        System.out.println("A tem " + Math.round(populacao_a) + " habitantes e B tem " + Math.round(populacao_b));

    }
}

