package Ficha_02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num1, num2;

        //Ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        //Apresentar o valor

        if (num1 > num2) {
            System.out.println("A ordenação correta é: " + num2 + "   " + num1 );

        }else {
            if (num1 < num2) {
                System.out.println("A ordenação correta é: " +num1 +"   " + num2);
            } else {
                if (num1 == num2) {
                    System.out.println("São os dois iguais: " + num1 + "   " + num2);
                }
            }
        }

}}
