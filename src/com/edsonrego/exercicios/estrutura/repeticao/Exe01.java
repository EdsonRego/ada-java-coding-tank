package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        /*Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota entre 0 e 10: ");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10){
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();
        }
        System.out.println("Você digitou a nota: " + nota + " VALIDADO.");

        sc.close();
    }
}
