package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        /*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
        que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde
        a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
        O Salário Líquido corresponde ao Salário Bruto menos os descontos.
        O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
            Desconto do IR:
            Salário Bruto até 900 (inclusive) - isento
            Salário Bruto até 1500 (inclusive) - desconto de 5%
            Salário Bruto até 2500 (inclusive) - desconto de 10%
            Salário Bruto acima de 2500 - desconto de 20% */
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de Cálculo de Folha de Pagamento");
        System.out.print("Informe o salário hora [R$]: ");
        double salarioHora = sc.nextDouble();
        System.out.print("Informe quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double sindicatoIndice = 0.03;
        final double fgtsIndice = 0.11;
        final double inssIndice = 0.10;

        if(salarioBruto > 0 && salarioBruto <= 900.00){
            double iRdesc = 0.0;
            double inssDesc = salarioBruto * inssIndice;
            double fgts = salarioBruto * fgtsIndice;
            double sindicatoDesc = salarioBruto * sindicatoIndice;
            double salarioLiquido = salarioBruto - inssDesc - iRdesc - sindicatoDesc;

            System.out.println("*********  DEMONSTRATIVO de PAGAMENTOS  *********");
            System.out.printf("* Salário bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("* (-) INSS: R$ %.2f\n", inssDesc );
            System.out.printf("* (-) Imposto de Renda: R$ %.2f\n", iRdesc  );
            System.out.printf("* (-) Sindicado ( 3 ) : R$ %.2f\n", sindicatoDesc );
            System.out.printf("* Salário Líquido: R$ %.2f\n", salarioLiquido );
            System.out.printf("* FGTS: R$ %.2f\n", fgts );
            System.out.println("**************************************************");

        } else if (salarioBruto > 900 && salarioBruto <= 1500.00) {
            double iRdesc = salarioBruto * 0.05;
            double inssDesc = salarioBruto * inssIndice;
            double fgts = salarioBruto * fgtsIndice;
            double sindicatoDesc = salarioBruto * sindicatoIndice;
            double salarioLiquido = salarioBruto - inssDesc - iRdesc - sindicatoDesc;

            System.out.println("*********  DEMONSTRATIVO de PAGAMENTOS  *********");
            System.out.printf("* Salário bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("* (-) INSS: R$ %.2f\n", inssDesc );
            System.out.printf("* (-) Imposto de Renda: R$ %.2f\n", iRdesc  );
            System.out.printf("* (-) Sindicado ( 3 ) : R$ %.2f\n", sindicatoDesc );
            System.out.printf("* Salário Líquido: R$ %.2f\n", salarioLiquido );
            System.out.printf("* FGTS: R$ %.2f\n", fgts );
            System.out.println("**************************************************");

        }else if (salarioBruto > 1500 && salarioBruto <= 2500.00) {
            double iRdesc = salarioBruto * 0.10;
            double inssDesc = salarioBruto * inssIndice;
            double fgts = salarioBruto * fgtsIndice;
            double sindicatoDesc = salarioBruto * sindicatoIndice;
            double salarioLiquido = salarioBruto - inssDesc - iRdesc - sindicatoDesc;

            System.out.println("*********  DEMONSTRATIVO de PAGAMENTOS  *********");
            System.out.printf("* Salário bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("* (-) INSS: R$ %.2f\n", inssDesc );
            System.out.printf("* (-) Imposto de Renda: R$ %.2f\n", iRdesc  );
            System.out.printf("* (-) Sindicado ( 3 ) : R$ %.2f\n", sindicatoDesc );
            System.out.printf("* Salário Líquido: R$ %.2f\n", salarioLiquido );
            System.out.printf("* FGTS: R$ %.2f\n", fgts );
            System.out.println("**************************************************");

        } else if (salarioBruto > 2500) {
            double iRdesc = salarioBruto * 0.2;
            double inssDesc = salarioBruto * inssIndice;
            double fgts = salarioBruto * fgtsIndice;
            double sindicatoDesc = salarioBruto * sindicatoIndice;
            double salarioLiquido = salarioBruto - inssDesc - iRdesc - sindicatoDesc;

            System.out.println("*********  DEMONSTRATIVO de PAGAMENTOS  *********");
            System.out.printf("* Salário bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("* (-) INSS: R$ %.2f\n", inssDesc );
            System.out.printf("* (-) Imposto de Renda: R$ %.2f\n", iRdesc  );
            System.out.printf("* (-) Sindicado ( 3 ) : R$ %.2f\n", sindicatoDesc );
            System.out.printf("* Salário Líquido: R$ %.2f\n", salarioLiquido );
            System.out.printf("* FGTS: R$ %.2f\n", fgts );
            System.out.println("**************************************************");

        }else {
            System.out.println("Valores informados inválidos");
        }

    }
}
