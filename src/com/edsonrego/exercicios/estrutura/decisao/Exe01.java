package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        /*Faça um Programa que peça dois números e imprima o maior deles*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Comparador de dois números");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        double maior = num1 > num2 ? num1: num2;
        System.out.println("Maior número = " + maior);

        sc.close();
    }
}
