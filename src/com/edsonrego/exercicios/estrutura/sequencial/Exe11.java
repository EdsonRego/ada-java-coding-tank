package com.edsonrego.exercicios.estrutura.sequencial;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        /*Faça um Programa que peça 2 números inteiros e um número real.
        Calcule e mostre:
        a) o produto do dobro do primeiro com metade do segundo .
        b) a soma do triplo do primeiro com o terceiro.
        c) o terceiro elevado ao cubo.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculador com 03 números");

        System.out.print("Valor 1 - entre com número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Valor 2 - entre com número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Valor 3 - entre com número real: ");
        double num3 = sc.nextInt();

        double calc1 = (num1 * num1) * (num2 / 2);
        double calc2 = (num1 * 3) + (num3);
        double calc3 = Math.pow(num3, 3);

        System.out.println("a) o produto do dobro do primeiro com metade do segundo = " + calc1);
        System.out.println("b) a soma do triplo do primeiro com o terceiro = " + calc2);
        System.out.println("c) o terceiro elevado ao cubo = " + calc3);
        sc.close();
    }
}
