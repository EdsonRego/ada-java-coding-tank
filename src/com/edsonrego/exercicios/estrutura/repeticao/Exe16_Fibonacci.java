package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe16_Fibonacci {
    public static void main(String[] args) {
        /*A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
        Faça um programa que gere a série até que o valor seja maior que 500.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Sequência de Fibonacci - até o n−ésimo termo");
        System.out.print("Digite o n−ésimo termo: ");
        int n = sc.nextInt();
        int termo = n;
        int ultimo = 0;
        int penultimo = 1;

        if(n == 1 ){
            System.out.println("1");
        }else {
            for (int i=1; i <= n ; i++) {
                if (termo < 500) {
                    termo = ultimo + penultimo;
                    penultimo = ultimo;
                    ultimo = termo;
                    System.out.println("a" + i + " = " + termo);
                }
            }
        }


        sc.close();
    }
}
