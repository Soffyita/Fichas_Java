package Ficha_03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, inicio = 1;
        String mensagem;

        //Limpeza de buffer - apanhar o enter, quando o string vem depois de outra questão
        input.nextLine();

    //Ler variáveis
        System.out.println("Introduza a mensagem que deseja repetir:");
        mensagem = input.nextLine();
        System.out.println("Indique um número: ");
        num = input.nextInt();


        //Ler resultado
        while (inicio<=num){
            System.out.println(mensagem);
            inicio=inicio+1;
        }


    }
}
