package Ficha_05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int somaDiagonal = 0;

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print("Insira um número na matriz, posição [" + k + "][" + m + "]: ");
                matriz[k][m] = input.nextInt();

            }
        }

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                if (k==m) {
                    somaDiagonal=somaDiagonal+matriz[k][m];
                }
            }
//for (int k = 0; k < matriz.length; k++) {
            //somaDiagonal =somaDiagonal + matriz[k][k];

            System.out.println("Somatório é : "+ somaDiagonal);
    }
}}
