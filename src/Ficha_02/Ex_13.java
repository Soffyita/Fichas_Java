package Ficha_02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int horas, minutos;

        // Ler horas
        System.out.println("Introduza as horas: ");
        horas = input.nextInt();

        //Ler minutos
        System.out.println("Introduza os minutos");
        minutos = input.nextInt();

        if ((horas >= 1) && (horas <= 11)) {
            System.out.println("São " + horas + ":" + minutos + " AM");
        } else {
            if (horas == 0) {
                System.out.println("São " + 12 + ":" + minutos + " AM");}
            else {
                if ((horas >=13) && (horas <= 23)) {
                    System.out.println((horas -12) + ":" + minutos +" PM");}
                else {
                    if (horas == 12) {
                        System.out.println("São " + 12 + ":" + minutos + " PM");}
                }
            }

        }





    }}

