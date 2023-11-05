package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        /*Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcula a média de 04 números");
        double nota = 0;
        double notasSoma = 0;
        double notasMedia = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            nota = sc.nextDouble();
            notasSoma +=nota;
        }
        
        notasMedia = notasSoma / 4;

        System.out.println("Média das notas = " + notasMedia);

        sc.close();
    }
}
