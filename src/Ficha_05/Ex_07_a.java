package Ficha_05;

import java.util.Scanner;

public class Ex_07_a { // versão do Francisco
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Insira um número:");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // Meter o primeiro par que
                int max = arr[i]; //se encontra no array como máximo

                for (int k = 0; k < arr.length; k++) {
                    if ((arr[k] > max) && (arr[k] % 2 == 0)) { // Se o valor actual
                        max = arr[k];       // for par e maior do que o primeiro
                    }                       // par que lá enfiámos
                }

                System.out.println("Maior par: " + max);
                break;

            } else {
                System.out.println("Não há pares.");
                break;
            }
        }
    }
}