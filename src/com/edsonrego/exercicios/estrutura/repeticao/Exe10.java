package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        /*Faça um programa que receba dois números inteiros e
        gere os números inteiros que estão no intervalo compreendido por eles*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Gerador de números inteiros");
        System.out.print("Digite o primeiro número do intervalo: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número do intervalo: ");
        int num2 = sc.nextInt();

        for (; num1 <= num2; num1++ ){
            System.out.println("num1 = " + num1);
        }
        sc.close();
    }
}
