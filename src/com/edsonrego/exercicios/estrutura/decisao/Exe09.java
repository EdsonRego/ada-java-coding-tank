package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        /*Faça um Programa que leia três números e mostre-os em ordem decrescente.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ordenador de três números");

        System.out.print("Digite o primeiro número: ");
        double primeiro = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double segundo = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double terceiro = sc.nextDouble();
        double aux;

        if(terceiro > segundo){
                aux = terceiro;
                terceiro = segundo;
                segundo = aux;
            }
        if(segundo > primeiro){
            aux = segundo;
            segundo = primeiro;
            primeiro = aux;
        }

        if (terceiro > segundo){
            aux = terceiro;
            terceiro = segundo;
            segundo = aux;
        }

        System.out.println("primeiro = " + primeiro);
        System.out.println("segundo = " + segundo);
        System.out.println("terceiro = " + terceiro);

        sc.close();
    }
}
