package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        /*Faça um Programa que leia três números e mostre o maior e o menor deles.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Comparador de três números");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        double aux = num1 > num2 ? num1: num2;
        double maiorNumero = aux > num3 ? aux : num3;

        double aux2 = num1 < num2 ? num1: num2;
        double menorNumero = aux2 < num3 ? aux2 : num3;

        System.out.println("menorNumero = " + menorNumero);
        System.out.println("maiorNumero = " + maiorNumero);

        sc.close();
    }
}
