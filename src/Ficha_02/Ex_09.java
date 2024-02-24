package Ficha_02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num1, num2, num3;

        //Ler variáveis
        System.out.println("Digite 3 números aleatórios: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

if ((num1 < num2) && (num1 < num3)) {
    System.out.print("O menor dos 3 é: " +num1); }
    else {
        if ((num2 < num1) && (num2 < num3)) {
            System.out.print("O menor dos 3 é: " +num2); }
        else {
            if ((num3 < num1) && (num3 < num2)) {
                System.out.println("O menor dos 3 é: " + num3);
            }
        }
    }
}}


