package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        /*Faça um Programa que peça dois números e imprima a soma.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Somador de dois números:");

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int resultado =  a + b;
        System.out.println("A soma de " + a + " com " + b + " = " + resultado );

        sc.close();
    }
}
