package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        /*Faça um Programa que converta metros para centímetros.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversos de Metros para Centímetros");
        System.out.print("Digite o valor em Metros: ");
        int metros = sc.nextInt();
        int centimetros = metros * 100;
        System.out.print(metros + " metros , equivalem a " + centimetros + " centímetros");

        sc.close();
    }
}
