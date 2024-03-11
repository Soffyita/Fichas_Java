package Ficha_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int[][] matriz = new int[3][3];
        int num, maior, menor;


        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print("Insira um número na matriz, posição [" + k + "][" + m + "]: ");
                matriz[k][m] = input.nextInt();

            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                if (matriz[k][m] > maior) {
                    maior = matriz[k][m];
                } else {
                    if (matriz[k][m] < menor) {
                        menor = matriz[k][m];
                    }

                }
            }
        }
        System.out.println("O maior número presente na matriz é: " + maior);

        System.out.println("O menor número presente na matriz é: " + menor);

        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz.length; m++) {
                System.out.print(matriz[k][m] + "\t"); // utilizar \t que significa a tabulação e permite uma melhor leitura visual

            }
            System.out.println();
        }
    }
}