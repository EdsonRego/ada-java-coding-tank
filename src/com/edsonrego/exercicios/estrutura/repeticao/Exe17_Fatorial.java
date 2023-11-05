package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe17_Fatorial {
    public static void main(String[] args) {
        /*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo Fatorial");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++){
            fatorial *= i;
            System.out.println(i + "!= " + fatorial);
        }
        System.out.println("Fatorial de " + num + " é = " + fatorial);
        sc.close();
    }
}
