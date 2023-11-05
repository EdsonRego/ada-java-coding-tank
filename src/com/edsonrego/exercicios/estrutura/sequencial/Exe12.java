package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        /*Tendo como dados de entrada a altura de uma pessoa,
        construa um algoritmo que calcule seu peso ideal,
        usando a seguinte fórmula: (72.7*altura) - 58*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de peso ideal");
        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();
        double pesoIdeal =  (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);

        sc.close();
    }
}
