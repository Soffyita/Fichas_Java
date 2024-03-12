package Ficha_05;

import java.util.Scanner;

public class Ex_07_b {

    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar = -1;

        System.out.println("**************************");


        //Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0){
                maiorPar = vetor[i];
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] > maiorPar) {
                maiorPar = vetor[i];
            }
        }
        //Apresentar o maior par
        if (maiorPar % 2 == 0) {
            System.out.println("Maior Par: " + maiorPar);
        } else {
            System.out.println("Não tem pares!");
        }
    }
}