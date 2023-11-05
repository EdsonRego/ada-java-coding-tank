package com.edsonrego.prova;

import java.util.Scanner;

public class TabelaSAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora SAC");
        System.out.print("Valor do empréstimo: ");
        double total_saldo_devedor = sc.nextDouble();

        System.out.print("Taxa de juros: ");
        double juros_ao_mes = sc.nextDouble();

        System.out.print("Tempo para pagamento [meses]: ");
        double total_de_meses = sc.nextDouble();

        double amortizacaoFixa = total_saldo_devedor / total_de_meses;
        double juros_mensal;
        double amortizacao;
        double parcela_mensal;
        double saldo_devedor_atual;

        System.out.println("Valor fixo da amortização R$ "
                + amortizacaoFixa + " Saldo devedor total R$ "
                + total_saldo_devedor + " com um juros de "
                + juros_ao_mes + "%  ao mês");
        System.out.println();

        for(int i = 1 ; i < total_de_meses; i++){
            juros_mensal = total_saldo_devedor * juros_ao_mes / 100;
            amortizacao = total_saldo_devedor - juros_mensal - amortizacaoFixa;
            parcela_mensal = juros_mensal + amortizacaoFixa;
            saldo_devedor_atual = total_saldo_devedor - parcela_mensal;

            System.out.println("Parcela "+ i + "| Juros: R$ " + juros_mensal + " | Prestação: R$ " + parcela_mensal + " | Saldo devedor: R$ " + saldo_devedor_atual);

        }

        sc.close();
    }
}
