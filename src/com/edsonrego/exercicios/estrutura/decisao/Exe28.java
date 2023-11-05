package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        /*Promoção de Carnes*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Hipermercado Tabajara");
        System.out.println("Selecione o tipo de carne:");
        System.out.println("Digite 1 - FILE DUPLO:");
        System.out.println("Digite 2 - Alcatra:");
        System.out.println("Digite 3 - Picanha:");
        System.out.print("Digitar opção: ");
        int opcao = sc.nextInt();
        System.out.print("Digite a quantidade[Kg]: ");
        double peso = sc.nextInt();
        System.out.print("Pagamento com Cartão Tabajara? [S/N] ");
        String cartao = sc.next();
        String nome = null;
        double preco = 0;
        double precoTotal = 0;

        if(opcao == 1) {
            nome = "FILE DUPLO";
            if (peso <= 5) {
                preco = peso * 4.90;
            } else {
                preco = peso * 4.80;
            }
        }
        if(opcao == 2) {
            nome = "ALCATRA";
            if (peso <= 5) {
                preco = peso * 5.90;
            } else {
                preco = peso * 6.80;
            }
        }
        if(opcao == 3) {
            nome = "PICANHA";
            if (peso <= 5) {
                preco = peso * 6.90;
            } else {
                preco = peso * 7.80;
            }
        }

        if(cartao.equalsIgnoreCase("S")){
            double desconto = ((preco * 5) / 100);
            precoTotal = preco - desconto;
        }else {
            precoTotal = preco;
        }

        System.out.println("***************************CUPOM FISCAL**************************************");
        System.out.println("* Carne: " + nome);
        System.out.printf("* Quantidade:  %.1f Kg\n", peso);
        System.out.printf("* Preço: R$ %.2f\n", preco);
        System.out.println("* Cartão Tabajara: " + cartao);
        System.out.printf("* Total com desconto: R$ %.2f\n", precoTotal );

        sc.close();
    }
}
