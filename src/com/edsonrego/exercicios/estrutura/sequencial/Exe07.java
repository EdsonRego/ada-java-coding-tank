package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        /*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora da área do quadrado");
        System.out.print("Digite a medida do lado do quadrado (cm): ");
        double lado = sc.nextDouble();
        double areaDobro = lado * lado * 2;
        System.out.printf("O dobro da área do quadrado de lado " + lado + " é: %.2f" , areaDobro );

        sc.close();
    }
}
