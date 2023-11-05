package com.edsonrego.prova;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de Temperatura");
        System.out.print("Informe a temperatura: ");
        double temperatura = sc.nextDouble();
        System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F]: ");
        String unidadeTempOrig = sc.next();
        System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F]: ");
        String unidadeTempDest = sc.next();

        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        if (unidadeTempOrig.equalsIgnoreCase("C")
                && unidadeTempDest.equalsIgnoreCase("F")) {
            System.out.println("Conversão Celcius para Fahrenheit.");
            fahrenheit = (temperatura * 9 / 5) + 32;
            System.out.printf(temperatura + "C = " + fahrenheit + "F");

        } else if (unidadeTempOrig.equalsIgnoreCase("C")
                && unidadeTempDest.equalsIgnoreCase("K")) {
            System.out.println("Conversão Celcius para Kelvin.");
            kelvin = 273.15 + temperatura;
            System.out.printf(temperatura + "C = " + kelvin + "K");

        }else if (unidadeTempOrig.equalsIgnoreCase("k")
                && unidadeTempDest.equalsIgnoreCase("C")) {
            System.out.println("Conversão Kelvin para Celsius.");
            celsius = temperatura - 273.15;
            System.out.printf(temperatura + "K = " + celsius + "C");

        }else if (unidadeTempOrig.equalsIgnoreCase("k")
                && unidadeTempDest.equalsIgnoreCase("F")) {
            System.out.println("Conversão Kelvin para Fahrenheit.");
            celsius = temperatura - 273.15;
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf(temperatura + "K = " + fahrenheit + "F");

        }else if (unidadeTempOrig.equalsIgnoreCase("F")
                && unidadeTempDest.equalsIgnoreCase("C")) {
            System.out.println("Conversão Fahrenheit para Celsius.");
            celsius = (temperatura - 32) * 5 / 9;
            System.out.printf(temperatura + "K = " + celsius + "C");

        }else if (unidadeTempOrig.equalsIgnoreCase("F")
                && unidadeTempDest.equalsIgnoreCase("K")) {
            System.out.println("Conversão Fahrenheit para Kelvin.");
            kelvin = 273.15 +  (temperatura - 32) * 5 / 9;
            System.out.printf(temperatura + "F = " + kelvin + "K");

        } else if (!unidadeTempOrig.equalsIgnoreCase("K")
                ||!unidadeTempOrig.equalsIgnoreCase("C")
                ||!unidadeTempOrig.equalsIgnoreCase("F")) {
            System.out.println("Unidade de origem  Invalida");

        }else if (!unidadeTempDest.equalsIgnoreCase("K")
                ||!unidadeTempDest.equalsIgnoreCase("C")
                ||!unidadeTempDest.equalsIgnoreCase("F")) {

            System.out.println("Unidade de destino Invalida");
        }
        sc.close();
    }
}