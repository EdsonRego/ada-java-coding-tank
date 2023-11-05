package com.edsonrego.exercicios.estrutura.repeticao;

import javax.swing.text.Style;
import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        /*Faça um programa que peça dois números, base e expoente,
        calcule e mostre o primeiro número elevado ao segundo número.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Exponenciais");
        System.out.print("Base = ");
        double base = sc.nextDouble();

        System.out.print("Expoente = ");
        double expoente = sc.nextDouble();

        double resultado = 1;

        for(int i = 0 ; i < expoente; i++){
            resultado *= base ;
        }
        System.out.println("resultado = " + resultado);

        sc.close();
    }
}
