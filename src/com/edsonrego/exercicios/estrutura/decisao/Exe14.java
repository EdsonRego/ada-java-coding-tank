package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        /*faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
        e calcule a sua média.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo de média escolar");
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;

        if(media >= 9.0 && media <= 10.0){
            System.out.println("Conceito A");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Conceito B");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Conceito C");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito D");
        } else if (media >= 0.0 && media < 4.0) {
            System.out.println("Conceito E");
        }else {
            System.out.println("Valor Inválido");
        }
        sc.close();
    }
}
