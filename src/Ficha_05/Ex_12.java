package Ficha_05;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        for (int k = 0; k < array1.length; k++) {
            System.out.print("Insira um número no array1 [" + k + "]: ");
            array1[k] = input.nextInt();
        }
        for (int k = 0; k < array2.length; k++) {
            System.out.print("Insira um número no array2[" + k + "]:");
            array2[k] = input.nextInt();
        }

        for (int k = 0; k < matriz.length; k++) {
            matriz[k][0] = array1[k];
            matriz[k][1] = array2[k];
           }

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz [0].length; m++) {
                System.out.print(matriz [k][m] +"\t");

            }
            System.out.println();
        }

    }


}
