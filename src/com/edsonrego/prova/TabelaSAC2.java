package com.edsonrego.prova;

import java.util.Scanner;

public class TabelaSAC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora SAC");
        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.print("Taxa de juros: ");
        double taxaJurosMensal = sc.nextDouble();

        System.out.print("Tempo para pagamento [meses]: ");
        double prazo = sc.nextDouble();

        double parcelaMensalFixa = valorEmprestimo / prazo;
        double saldoDevedor = valorEmprestimo;
        double jurosMensal = 0;
        double parcelaMensal = 0;
        double totalPago = 0;

        System.out.println("Valor fixo da amortização R$ "
                + parcelaMensalFixa + " Saldo devedor total R$ "
                + valorEmprestimo + " com um juros de "
                + taxaJurosMensal + "%  ao mês");
        System.out.println();

        for(int i = 1; i <= prazo ; i++){

            jurosMensal = saldoDevedor * taxaJurosMensal / 100;
            parcelaMensal = parcelaMensalFixa + jurosMensal;
            saldoDevedor -= parcelaMensalFixa;
            totalPago += parcelaMensal;

            System.out.printf("Parcela %d\t| Amortização : R$ %.2f\t | Juros: R$ %.2f\t | Prestação: R$ %.2f\t| Saldo devedor: R$ %.2f\t| \n",
                    i, parcelaMensalFixa,jurosMensal, parcelaMensal, saldoDevedor);
        }

        System.out.printf("Tota Pago = R$ %.2f", totalPago);
        sc.close();
    }
}
