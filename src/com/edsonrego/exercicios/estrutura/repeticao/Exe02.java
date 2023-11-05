package com.edsonrego.exercicios.estrutura.repeticao;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        /*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
        mostrando uma mensagem de erro e voltando a pedir as informações.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuário: ");
        String usuario = sc.next();
        System.out.print("Senha: ");
        String password = sc.next();

        while (usuario.equalsIgnoreCase(password)){
            System.out.println("Usuário ou Senha Inválidos");
            System.out.print("Usuário: ");
            usuario = sc.next();
            System.out.print("Senha: ");
            password = sc.next();
        }
        System.out.println("Usuário Validado");

        sc.close();
    }
}
