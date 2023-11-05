package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        /*Faça um programa que peça o tamanho de um arquivo para download (em MB)
        e a velocidade de um link de Internet (em Mbps),
        calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Tempo de Download");
        System.out.print("Informe o tamanho do arquivo a ser baixado [MB] ");
        double tamanhoArquivo = sc.nextDouble();
        System.out.print("Informe a velocidade do link da Internet [Mbps] ");
        double velocidadeLink = sc.nextDouble();
        double resultado = tamanhoArquivo / velocidadeLink / 8;

        System.out.print("Tempo aproximado para Download [segundos] = " + resultado);
    }

}
