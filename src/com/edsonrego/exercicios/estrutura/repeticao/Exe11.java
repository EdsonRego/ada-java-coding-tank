package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        /*Altere o programa anterior para mostrar no final a soma dos números.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Gerador de números inteiros");
        System.out.print("Digite o primeiro número do intervalo: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número do intervalo: ");
        int num2 = sc.nextInt();
        int soma = 0;

        for (; num1 <= num2; num1++ ){
            System.out.println("num1 = " + num1);
            soma += num1;
        }
        System.out.println("Soma de todos os números = " + soma);
        sc.close();
    }
}
