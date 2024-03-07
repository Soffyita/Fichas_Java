package Ficha_03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {


        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int inicio, fim;

        //Ler valores
        System.out.println("Indique o valor de inicio: ");
        inicio=input.nextInt();
        System.out.println("Indique o valor de fim: ");
        fim= input.nextInt();


        while (inicio <= fim) {
            if (inicio%5==0) {
            System.out.println(inicio);
            }

            inicio=inicio+1;


        }
    }
}

