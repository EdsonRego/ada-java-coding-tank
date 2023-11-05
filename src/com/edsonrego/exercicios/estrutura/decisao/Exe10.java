package com.edsonrego.exercicios.estrutura.decisao;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte em que turno você estuda.
        Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!"
        ou "Valor Inválido!", conforme o caso.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, qual é o seu turno? ");
        System.out.println("Digita:\nM se matutino,\nV se Vespertino ou\nN se Noturno.");
        System.out.print("> ");
        String turno = sc.next().toLowerCase().toUpperCase();

        if(turno.equals("M")){
            System.out.println("Bom dia!");
        } else if (turno.equals("V")) {
            System.out.println("Boa tarde!");
        }else if (turno.equals("N")){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Valor inválido");
        }
    }
}
