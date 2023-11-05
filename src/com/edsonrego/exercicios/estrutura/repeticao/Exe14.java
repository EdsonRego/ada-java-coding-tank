package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        /*Faça um programa que peça 10 números inteiros,
        calcule e mostre a quantidade de números pares e a quantidade de números impares*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Analisador de 10 números");

        double numero = 0;
        double numeroPar = 0;
        double numeroImpar = 0;
        int countPar = 0;
        int countImpar = 0;
        for (int i = 1 ; i <= 10 ; i++){
            System.out.print("Digite o " + i + " numero: ");
            numero = sc.nextDouble();
            if(numero % 2 == 0){
                numeroPar += numero;
                countPar++;
            }else {
                numeroImpar += numero;
                countImpar++;
            }
        }
        System.out.println("numeroPar = " + numeroPar);
        System.out.println("countPar = " + countPar);
        System.out.println("numeroImpar = " + numeroImpar);
        System.out.println("countImpar = " + countImpar);

        sc.close();
    }
}
