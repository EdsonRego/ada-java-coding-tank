package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        /*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas,
        dezenas e unidades do mesmo.
        Observando os termos no plural a colocação do "e", da vírgula entre outros.*/
        Scanner sc =  new Scanner(System.in);

        System.out.println("Verificador de numérico");
        System.out.print("Digite um número inteiro menor que 1000 = ");
        int numero = sc.nextInt();

        //Cálculo da unidade
        int unidade = numero % 10;
        System.out.println("unidade = " + unidade);

        //Cálculo da dezena
        numero = (numero - unidade) / 10;
        int dezena = numero % 10;
        System.out.println("dezena = " + dezena);

        //Cálculo da centena
        int centena = (numero - dezena) / 10;
        System.out.println("centena = " + centena);

        System.out.println("O numero " + numero + " tem: " + centena +" centena, " + dezena + " dezena, " + unidade + " unidade." );

        sc.close();
    }
}
