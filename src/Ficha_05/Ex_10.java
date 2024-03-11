package Ficha_05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int[][] matriz = new int[3][5];
        int num, contador = 0;

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz[0].length; m++) {
                System.out.print("Insira um número na matriz, posição [" + k + "][" + m + "]: ");
                matriz[k][m] = input.nextInt();

            }
        }


        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(matriz[k][m] + "\t"); // utilizar \t que significa a tabulação e permite uma melhor leitura visual

            }
            System.out.println();
        }


        System.out.println("Insira um número para pesquisar: ");
        num = input.nextInt();

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < 5; m++) {
                if (matriz[k][m]==num) {
                    contador = contador + 1;
                }

            }


        }
        System.out.println("Existem " + contador + " posições na matriz com o número " + num);
    }
}
