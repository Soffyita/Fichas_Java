package Ficha_05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        // Importar scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int[] num = new int[10];
        boolean crescente = true;

        //Ler elemento
        for (int a = 0; a < num.length; a++) {
            System.out.println("Insira um número no vetor [" + a + "]");
            num[a] = input.nextInt();
        }
        for (int a = 1; a < num.length; a++) {
            if (num[a] <= num[a-1]) {
                crescente = false;
            }
        }
        if (crescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }


    }
}