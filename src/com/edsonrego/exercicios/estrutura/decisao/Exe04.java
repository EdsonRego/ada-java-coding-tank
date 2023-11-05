package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        /*Faça um Programa que verifique se uma letra digitada é vogal ou consoante.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Analisador do Alfabeto - Vogal ou consoante");
        System.out.print("Digite uma letra do alfabeto: ");
        String letra = sc.next().toLowerCase().toUpperCase();;
        switch (letra) {
            case "A", "E", "I", "O", "U":
                System.out.println("A letra " + letra + " é uma Vogal");
                break;
            case "B", "C", "D", "F", "G", "H", "J", "K", "L","M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z":
                System.out.println("A letra " + letra + " é uma Consoante");
                break;
            default:
                System.out.println("Digite somente uma única letra do alfabeto -  aA zZ");
        }
        sc.close();
    }
}
