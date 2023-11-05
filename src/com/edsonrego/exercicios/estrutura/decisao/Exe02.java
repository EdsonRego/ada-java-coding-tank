package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Identificador de números - Positivos ou Negativos");
        System.out.print("Digite o primeiro: ");
        double num1 = sc.nextDouble();
        String maior = num1 >= 0 ? "Positivo": "Negativo";
        System.out.println("O número " + num1 + " é " + maior);

        sc.close();
    }
}
