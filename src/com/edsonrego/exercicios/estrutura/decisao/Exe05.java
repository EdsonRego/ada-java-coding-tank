package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        /*Faça um programa para a leitura de duas notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e apresentar:
                A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
                A mensagem "Reprovado", se a média for menor do que sete;
                A mensagem "Aprovado com Distinção", se a média for igual a dez.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema avaliador de duas notas");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
