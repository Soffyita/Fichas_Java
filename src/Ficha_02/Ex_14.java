package Ficha_02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double num1, num2, num3;

        //Ler números
        System.out.print("Digite, por favor, 3 números. Primeiro nº: ");
        num1 = input.nextDouble();

        System.out.print("Agora o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Por fim, o terceiro: ");
        num3 = input.nextDouble();

        if ((num1 <= num2) && (num1 <= num3) && (num2 <= num3)) {
            System.out.println("A ordem correta é: " + num1 + " " + num2 +" " + num3);}
            else {
                if ((num1 <= num3) && (num1 <= num2) && (num3 <= num2)) {
                    System.out.println("A ordem correta é: " + num1 + " " + num3 +" " + num2);
                }
                else {
                    if ((num2 <= num3) && (num2 <= num1) && (num3 <= num1)) {
                        System.out.println("A ordem correta é: " + num2 + " " + num3 +" " + num1);
                    }
                    else {
                        if ((num2 <= num1) && (num2 <= num3) && (num1 <= num3)) {
                            System.out.println("A ordem correta é: " + num2 + " " + num1 +" " + num3);
                    }
                        else {
                            if ((num3 <= num2) && (num3 <= num1) && (num2 <= num1)) {
                                System.out.println("A ordem correta é: " + num3 + " " + num2 +" " + num1);
                        }
                            else {
                                if ((num3 <= num1) && (num3 <= num2) && (num1 <= num2)) {
                                    System.out.println("A ordem correta é: " + num3 + " " + num1 +" " + num2);
                            }
                }


            }







}}}}}
