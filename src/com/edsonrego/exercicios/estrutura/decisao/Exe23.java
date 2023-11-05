package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número e informe se o número é inteiro ou decimal*/

        Scanner sc =  new Scanner(System.in);

        System.out.println("Verificador de números, se INTEIRO ou DECIMAL");
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        if(Math.round(numero) == numero){
            System.out.println("O número " + numero + " é INTEIRO");
        }else {
            System.out.println("O número " + numero + " é DECIMAL");
        }

        sc.close();
    }
}
