package Ficha_05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print("Insira um número na matriz [" + k + m + "]: ");
                matriz[k][m] = input.nextInt();
            }

        }

        //Necessário imprimir a matriz bidimensional

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print(matriz [k][m] +" "); // utilizar \t que significa a tabulação e permite uma melhor leitura visual

            }
            System.out.println();

        }


    }
}
