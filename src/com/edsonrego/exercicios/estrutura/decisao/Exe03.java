package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        /*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de letra digitada");
        System.out.print("Informe o seu sexo [F]/[M]: ");
        String letra = sc.next().toLowerCase().toUpperCase();
        if (letra.equals("F")){
            System.out.println("F - Feminino");
        } else if (letra.equals("M")) {
            System.out.println("M - Masculino");
        }else {
            System.out.println("Sexo Inválido");
        }

        sc.close();
    }
}
