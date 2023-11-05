package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Salário");
        System.out.print("Quanto você ganha por hora? ");
        double salarioHora = sc.nextDouble();
        System.out.print("Quantas horas você trabalha por mês? ");
        double horasPorMes = sc.nextDouble();
        double salarioMensal = salarioHora * horasPorMes;

        System.out.printf("Seu salario mensal é = %.2f " , salarioMensal);

        sc.close();
    }
}
