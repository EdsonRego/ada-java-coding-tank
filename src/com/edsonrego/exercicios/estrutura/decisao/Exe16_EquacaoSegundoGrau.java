package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe16_EquacaoSegundoGrau {
    public static void main(String[] args) {
        /*Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
        O programa deverá pedir os valores de a, b e c e fazer as consistências,
        informando ao usuário nas seguintes situações:*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora equação do Segundo Grau:");
        System.out.print("Digite o valor de [a] = ");
        double a = sc.nextDouble();
        if (a == 0){
            System.out.println("Valor de [a]= " + a + ",  não é equação de segundo grau.");
        } else {
            System.out.print("Digite o valor de [b] = ");
            double b = sc.nextDouble();
            System.out.print("Digite o valor de [c] = ");
            double c = sc.nextDouble();
            double delta = (b * b)-(4 * a * c);
            if (delta < 0 ){
                // testar com a=2, b=2, c = 2
                System.out.println("Delta negativo = " + delta + ", Equação não possui raízes reais.");
            } else if (delta == 0) {
                // testar com a=1, b=-6, c = 9
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("Delta = " + delta + ", possui uma raiz = " + x1);
            }else {
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("Delta positivo = " + delta + ", possui duas raízes = " + x1 + ", " + x2);
            }
        }
    }
}
