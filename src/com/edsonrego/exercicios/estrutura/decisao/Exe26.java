package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Posto de Combustível");
        System.out.print("Selecione tipo: [A]-Alcool ou [G]-Gasolina ");
        String tipoCombustivel = sc.next();
        System.out.print("Informe a quantidade [Lts] ");
        double quantidade = sc.nextDouble();
        double valorSerPago = 0;
        double preco = 0;
        final double precoAlcool = 1.90;
        final double precoGasolina = 2.50;
        final double desconto3 = 0.97;
        final double desconto4 = 0.96;
        final double desconto5 = 0.95;
        final double desconto6 = 0.94;

        if(tipoCombustivel.equalsIgnoreCase("A")){
            preco = precoAlcool;
            if(quantidade <= 20){
                valorSerPago = quantidade * preco * desconto3 ;
            }else if(quantidade > 20){
                valorSerPago = quantidade + preco * desconto5;
            }else {
                System.out.println("Valor informados divergentes");
            }
            System.out.println("Valor a ser pago = " + valorSerPago);

        } else if (tipoCombustivel.equalsIgnoreCase("G")) {
            preco = precoGasolina;
            if(quantidade <= 20){
                valorSerPago = quantidade * preco * desconto4;
            }else if(quantidade > 20){
                valorSerPago = quantidade + preco * desconto6;
            }else {
                System.out.println("Valor informados divergentes");
            }
            System.out.println("Valor a ser pago = " + valorSerPago);
        }

        sc.close();
    }
}
