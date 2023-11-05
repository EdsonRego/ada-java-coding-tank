package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        /*Faça um Programa para leitura de três notas parciais de um aluno.
         O programa deve calcular a média alcançada por aluno e presentar:*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de média de 03 provas");
        System.out.print("Digite a nota da 1a prova: ");
        double notaUm = sc.nextDouble();
        System.out.print("Digite a nota da 2a prova: ");
        double notaDois = sc.nextDouble();
        System.out.print("Digite a nota da 3a prova: ");
        double notaTres = sc.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;
        
        if(media == 10){
            System.out.println("Média = " + media + " Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Média = " + media + " Aprovado");
        } else if (media >= 0 && media < 7) {
            System.out.println("Média = " + media + " Reprovado");
        }else {
            System.out.println("Valores informados inválidos");
        }

        sc.close();
    }
}
