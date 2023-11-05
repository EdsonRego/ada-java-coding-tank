package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
         8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
            a. salário bruto.
            b. quanto pagou ao INSS.
            c. quanto pagou ao sindicato.
            d. o salário líquido.
            e. calcule os descontos e o salário líquido, conforme a tabela abaixo:*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Gerador de Cálculo de Pagamento");
        System.out.print("Digite o valor do salário/hora [R$]= ");
        double salarioHora = sc.nextDouble();
        System.out.print("Digite o número de horas trabalhas/mês [H]= ");
        double horasTrabalhadasMensal = sc.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadasMensal;
        double iR = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicado = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - iR - inss - sindicado;

        System.out.println();
        System.out.println("*********************************************");
        System.out.println("**** Cálculo de Pagamento - RESULTADO  ******");
        System.out.printf("* Salário Bruto = %.2f\n", salarioBruto);
        System.out.printf("* Imposto de Renda = %.2f\n" , iR);
        System.out.printf("* INSS = %.2f\n" , inss);
        System.out.printf("* Sindicado = %.2f\n" , sindicado);
        System.out.printf("* Salário Líquido = %.2f\n" , salarioLiquido);
        System.out.println("*********************************************");

        sc.close();
    }
}
