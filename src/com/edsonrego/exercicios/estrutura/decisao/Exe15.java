package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
       /* Faça um Programa que peça os 3 lados de um triângulo.
       O programa deverá informar se os valores podem ser um triângulo.
       Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Analisador de Triângulos");
        System.out.print("Digite a medida do lado A(cm): ");
        double a = sc.nextDouble();
        System.out.print("Digite a medida do lado B(cm): ");
        double b = sc.nextDouble();
        System.out.print("Digite a medida do lado C(cm): ");
        double c = sc.nextDouble();

        if ( a == 0.0 || b == 0 || c == 0){
            System.out.println("Não é Triângulo");
        }else if(a == b && b == c){
            System.out.println("Triângulo EQUILÁTERO");
        } else if (a == b || a == c) {
            System.out.println("Triângulo ISÓSCELES");
        } else if (b == c) {
            System.out.println("Triângulo ISÓSCELES");
        } else {
            System.out.println("Triângulo ESCALENO");
        }
        sc.close();
    }
}
