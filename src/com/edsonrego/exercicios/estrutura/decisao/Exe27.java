package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        /*Hortifruti*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Morangos = Qt[Kg] ");
        double pesoMorango = sc.nextDouble();
        System.out.print("Moçãs = Qt[Kg] ");
        double pesoMaca = sc.nextDouble();
        double custoMaca = 0;
        double custoMorango = 0;

        if(pesoMaca <= 5){
            custoMaca = pesoMaca * 1.8;
        } else if (pesoMaca > 5) {
            custoMaca = pesoMaca * 1.5;
        }else {
            System.out.println("Valores divergentes");
        }

        if(pesoMorango <= 5){
            custoMorango = pesoMorango * 2.5;
        } else if (pesoMaca > 5) {
            custoMorango = pesoMorango * 2.2;
        }else {
            System.out.println("Valores divergentes");
        }

        double custoTotal = custoMaca + custoMorango;
        double pesoTotal = pesoMorango + pesoMaca;

        if(pesoTotal > 8 || custoTotal > 25.00){
                custoTotal = custoTotal * 0.9;
        }

        System.out.printf("Você comprou %.1f Kg de maçã, e %.1f Kg de morangos." +
                "\nSua compra ficou em: R$%.2f",pesoMaca,pesoMorango,custoTotal);
        sc.close();
    }
}
