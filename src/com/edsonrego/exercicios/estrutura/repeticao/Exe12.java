package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        /*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Gerador de tabuada");
        System.out.print("Qual a tabuada desejada? [1 a 10] = ");
        int numero = sc.nextInt();
        boolean continuar = true;
        String resposta = null;

        while (continuar) {
            if (numero > 1 && numero <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            } else {
                System.out.println("Valor inválido");
            }
            System.out.print("Deseja continuar? [S/N] =");
            resposta = sc.next();
            if (resposta.equalsIgnoreCase("N")){
                continuar = false;
            }
        }

        sc.close();
    }
}
