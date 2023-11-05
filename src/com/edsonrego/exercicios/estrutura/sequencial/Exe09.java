package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        /*Faça um Programa que peça a temperatura em graus Fahrenheit,
        transforme e mostre a temperatura em graus Celsius.
        C = 5 * ((F-32) / 9).*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Temperatura Fahrenheit para Celsius");
        System.out.print("Digite a temperatura em graus F: ");
        double grausF = sc.nextDouble();
        double grausC = (grausF - 32 ) * 5 / 9;

        System.out.printf("A temperatura de " + grausF + " corresponde a %.2f " , grausC);

        sc.close();
    }
}
