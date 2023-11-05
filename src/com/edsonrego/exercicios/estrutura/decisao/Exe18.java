package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        /*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Validador de data");
        System.out.print("Digite uma data no formato [dd/mm/aaaa]: ");
        String data = sc.next();
        if (data.length() != 10){
            System.out.println("Formato Inválido");
        } else if (data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Formato Válido");
        }
    }
}
