package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        /*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Investigador");
        System.out.println("Por favor, responda as seguintes perguntas:");
        System.out.print("Telefonou para a vítima? [S/N] ");
        String pergunta1 = sc.next();
        System.out.print("Esteve no local do crime? [S/N] ");
        String pergunta2 = sc.next();
        System.out.print("Mora perto da vítima? [S/N] ");
        String pergunta3 = sc.next();
        System.out.print("Devia para a vítima? [S/N] ");
        String pergunta4 = sc.next();
        System.out.print("Já trabalhou com a vítima? [S/N] ");
        String pergunta5 = sc.next();

        int contadorSim = 0;
        if (pergunta1.equalsIgnoreCase("S")) {
            contadorSim++;
        }
        if (pergunta2.equalsIgnoreCase("S")) {
            contadorSim++;
        }
        if (pergunta3.equalsIgnoreCase("S")) {
            contadorSim++;
        }
        if (pergunta4.equalsIgnoreCase("S")) {
            contadorSim++;
        }
        if (pergunta5.equalsIgnoreCase("S")) {
            contadorSim++;
        }
        if (contadorSim == 2) {
            System.out.println("SUSPEITO!");
        } else if (contadorSim >= 3 && contadorSim <= 4) {
            System.out.println("CUMPLICE");
        } else if (contadorSim == 5) {
            System.out.println("CULPADO");
        } else {
            System.out.println("INCONCLUSIVO");
        }

        sc.close();
    }
}
