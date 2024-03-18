package Teste;

import java.util.Scanner;

public class Teste_06 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        int[]vetor = new int[10];
        int elemento;
        boolean enco=false;

        System.out.println("El");
        elemento= input.nextInt();

        for (int i=0;i< vetor.length;i++) {
            if (vetor[i]==elemento) {
                enco=true;
            }
        }
                if (enco){
                    System.out.println("O ele" + elemento + "foi");
                    }else {
                    System.out.println("O ele" + elemento + " n foi");
                }
    }
}
