package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        /*Faça um programa que, dado um conjunto de N números, determine o menor valor,
        o maior valor e a soma dos valores.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Analisador de n números");
        System.out.print("Digite quantos números você quer analisar? : ");
        int numeroTotal = sc.nextInt();
        int numero = 0;
        int numeroSomados = 0;
        int maiorNumero = 0;
        int menorNumero = 0;


        for (int i = 1; i <= numeroTotal; i++){
            System.out.print("Digite o numero " + i + " : ");
            numero = sc.nextInt();
            numeroSomados += numero;
            menorNumero = numero;

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            if (numero < menorNumero){
                menorNumero = numero;
            }
        }
        double media = (numeroSomados / numeroTotal);
        System.out.println("numeroSoma = " + numeroSomados);
        System.out.println("media = " + media);
        System.out.println("maiorNumero = " + maiorNumero);
        System.out.println("menorNumero = " + menorNumero);

    }
}
