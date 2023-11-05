package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        /*Faça um programa que leia 5 números e informe o maior número.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Comparador de 05 números");

        System.out.print("Digite o 1o. numero:");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o 2o. numero:");
        double numero2 = sc.nextDouble();

        System.out.print("Digite o 3o. numero:");
        double numero3 = sc.nextDouble();

        System.out.print("Digite o 4o. numero:");
        double numero4 = sc.nextDouble();

        System.out.print("Digite o 5o. numero:");
        double numero5 = sc.nextDouble();

        double maiorNumero = 0;

        if(numero1 > numero2){
            maiorNumero = numero1;
        } else{
            maiorNumero = numero2;
        }

        if(maiorNumero < numero3){
            maiorNumero = numero3;
        }

        if(maiorNumero < numero4){
             maiorNumero = numero4;
        }

        if(maiorNumero < numero5){
            maiorNumero = numero5;
        }

        System.out.println("maiorNumero = " + maiorNumero);

        sc.close();
    }
}
