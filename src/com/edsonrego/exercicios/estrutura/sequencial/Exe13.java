package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        /*Tendo como dado de entrada a altura (h) de uma pessoa,
        construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
            Para homens: (72.7*h) - 58
            Para mulheres: (62.1*h) - 44.7*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de peso ideal");
        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o seu sexo [F]/[M] ");
        String sexo = sc.next();

        if(sexo.equals("M")){
            double pesoIdeal =  (72.7 * altura) - 58;
            System.out.printf("Sexo Masculino - Seu peso ideal é: %.2f", pesoIdeal);
        } else if (sexo.equals("F")) {
            double pesoIdeal =  (62.1 * altura) - 44.7;
            System.out.printf("Sexo Feminino - Seu peso ideal é: %.2f", pesoIdeal);
        } else {
            System.out.println("Dados incorretos");
        }

        sc.close();
    }
}
