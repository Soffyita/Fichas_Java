package Ficha_05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];

        System.out.println("*****************");

        //Ler vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número no vetor [" + i + "]");
            vetor[i] = input.nextInt();
        }



        //Imprimir valor

        for (int i = 0; i < 10; i++) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }
    }
}


//        //Ler vetor
//        for (int i=0;1<vetor.length;i++) {
//            System.out.println("Insira um número no vetor [" +i + "]");
//            vetor[i] = input.nextInt();
//        }
//
//        System.out.println("****************");
//
//        //Imprimir valor
//
//        for (int i=0;1< vetor.length;i++) { desta forma, quando alteramos o tamanho do vetor,
//                                                não corremos o risco de gerar erro
//            System.out.println("vetor[" + i + "]: "+ vetor [i]);
//        }