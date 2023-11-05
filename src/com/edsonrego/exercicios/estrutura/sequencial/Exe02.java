package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("O número informado foi = " + num);

        sc.close();
    }
}
