package Ficha_02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Digite o seu salário bruto anual: ");
        salario = input.nextDouble();

        //poderia ser realizado apenas com if

        if (salario <= 15000) {
            System.out.println("Deverá pagar, à taxa de 20%: " + (salario * 0.2));
        } else {
            if (salario > 15000 && salario<= 20000) {
                System.out.println("Deverá pagar, à taxa de 30% " + (salario * 0.3));
            } else {
                if (salario > 2000 && salario<= 25000) {
                    System.out.println("Deverá pagar, à taxa de 35%: " + (salario * 0.35));
                } else {
                    if (salario > 25000) {
                        System.out.println("Deverá pagar, à taxa de 40%: " + (salario * 0.4));
                    }
                }
            }
        }
}}
