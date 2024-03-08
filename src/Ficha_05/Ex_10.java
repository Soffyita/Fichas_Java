package Ficha_05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.println("Insira um número na matriz [" + k + "][" + m + "]");
                matriz[k][m] = input.nextInt();

            }
        }
    }
}