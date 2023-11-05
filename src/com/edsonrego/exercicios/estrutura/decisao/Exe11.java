package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        /*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e
        lhe contraram para desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
        baseado no salário atual:
        a) salários até R$ 280,00 (incluindo) : aumento de 20%
        b) salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        c) salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        d) salários de R$ 1500,00 em diante : aumento de 5%
        Após o aumento ser realizado, informe na tela:
        a) o salário antes do reajuste;
        b) o percentual de aumento aplicado;
        c) o valor do aumento;
        d) o novo salário, após o aumento.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de cálculo de reajuste salarial");
        System.out.print("Informe o salário atual: ");
        double salarioInicial = sc.nextDouble();
        double salarioFinal = 0;

        final double indice05 = 1.05;
        final double indice10 = 1.10;
        final double indice15 = 1.15;
        final double indice20 = 1.20;

        if(salarioInicial > 0 && salarioInicial <= 280.00){
            salarioFinal = salarioInicial * indice20;
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioInicial);
            System.out.printf("Percentual de aumento aplicado: %.2f\n", (indice20 - 1));
            System.out.println("Valor do aumento: R$" + (salarioFinal - salarioInicial));
            System.out.printf("Novo salário: R$ %.2f", salarioFinal);

        } else if (salarioInicial > 280.00 && salarioInicial <=700 ) {
            salarioFinal = salarioInicial * indice15;
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioInicial);
            System.out.printf("Percentual de aumento aplicado: %.2f\n", (indice15 - 1));
            System.out.printf("Valor do aumento: R$ %.2f\n", (salarioFinal - salarioInicial));
            System.out.printf("Novo salário: R$ %.2f", salarioFinal);

        }else if (salarioInicial > 700.00 && salarioInicial <=1500 ) {
            salarioFinal = salarioInicial * indice10;
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioInicial);
            System.out.printf("Percentual de aumento aplicado: %.2f\n", (indice10 - 1));
            System.out.printf("Valor do aumento: R$ %.2f\n", (salarioFinal - salarioInicial));
            System.out.printf("Novo salário: R$ %.2f", salarioFinal);

        }else if (salarioInicial > 1500.00) {
            salarioFinal = salarioInicial * indice05;
            System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioInicial);
            System.out.printf("Percentual de aumento aplicado: %.2f\n", (indice05 - 1));
            System.out.printf("Valor do aumento: R$ %.2f\n", (salarioFinal - salarioInicial));
            System.out.printf("Novo salário: R$ %.2f", salarioFinal);

        }else {
            System.out.println("Digite um valor válido");
        }
        sc.close();
    }
}
