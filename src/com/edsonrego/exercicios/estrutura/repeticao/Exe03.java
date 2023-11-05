package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        /*Faça um programa que leia e valide as seguintes informações:
            Nome: maior que 3 caracteres;
            Idade: entre 0 e 150;
            Salário: maior que zero;
            Sexo: 'f' ou 'm';
            Estado Civil: 's', 'c', 'v', 'd';*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome =  sc.next();
        while (nome.length() <= 3){
            System.out.print("Nome: ");
            nome =  sc.next();
        }

        System.out.print("Idade: ");
        int idade =  sc.nextInt();
        while (idade < 0 || idade > 150){
            System.out.print("Idade: ");
            idade =  sc.nextInt();
        }

        System.out.print("Salário: ");
        double salario =  sc.nextDouble();
        while (salario < 0){
            System.out.print("Salário: ");
            salario =  sc.nextDouble();
        }

        System.out.print("Sexo: ");
        char sexo =  sc.next().charAt(0);
        while (sexo !='M'&& sexo !='F'){
            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);
        }

        System.out.print("Estado Civil: ");
        char estadoCivil =  sc.next().charAt(0);
        while (estadoCivil !='S'&& estadoCivil !='C' && estadoCivil !='V' && estadoCivil !='D'){
            System.out.print("Estado Civil: ");
            estadoCivil =  sc.next().charAt(0);
        }
        sc.close();
    }
}
