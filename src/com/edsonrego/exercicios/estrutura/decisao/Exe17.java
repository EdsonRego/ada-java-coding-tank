package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número correspondente a um determinado ano e
        em seguida informe se este ano é ou não bissexto*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Verificador se ano é bissexto!!");
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        System.out.println("Ano informado = " + ano);

        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0 )){
            System.out.println("O ano " + ano + " , é bissexto");
        }else {
            System.out.println("O ano " + ano + " , não é bissexto");
        }

        sc.close();
    }
}
