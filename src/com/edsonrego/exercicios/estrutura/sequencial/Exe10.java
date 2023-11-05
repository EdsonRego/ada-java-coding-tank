package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        /*Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Temperatura Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em graus C: ");
        double grausC = sc.nextDouble();
        double grausF = grausC * 1.8 + 32;

        System.out.printf("A temperatura de " + grausC + " corresponde a %.2f " , grausF);

        sc.close();
    }
}
