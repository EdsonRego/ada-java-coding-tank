package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número inteiro e determine se ele é par ou impar.*/
        Scanner sc =  new Scanner(System.in);

        System.out.println("Verificador de números, se PAR ou IMPAR");
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é PAR");
        }else {
            System.out.println("O número " + numero + " é IMPAR");
        }

        sc.close();
    }
}
