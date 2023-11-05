package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe15_while {
    public static void main(String[] args) {
        /*Fibonacci - Faça um programa capaz de gerar a série até o n−ésimo termo*/
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
            int count = 1;
            while (count <= n) {
                termo = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = termo;
                count ++;
                System.out.println(termo);
            }
        }

        sc.close();
    }
}
