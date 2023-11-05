package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        /*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora da área de circunferência");
        System.out.print("Digite o raio da circunferência (cm): ");
        double raio = sc.nextDouble();
        double area = Math.PI * raio * raio;
        System.out.printf("A circunferência de raio " + raio + " tem uma área de %.2f " , area );

        sc.close();
    }
}
