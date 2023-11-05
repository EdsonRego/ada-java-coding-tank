package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        /*Faça um programa que leia 5 números e informe a soma e a média dos números.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Comparador de 05 números");

        double numeroSoma = 0;

        for(int i = 1 ; i <= 5 ; i++) {
            System.out.print("Digite o "+ i +" numero: ");
            double numero = sc.nextDouble();
            numeroSoma += numero;
        }
        System.out.println("Soma = " + numeroSoma);
        System.out.println("Media = " + (numeroSoma / 5));

        sc.close();
    }
}
