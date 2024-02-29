package Ficha_03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int valorInicio, valorFim;

        //Ler valores
        System.out.println("Indique por favor, um número de inicío: ");
        valorInicio=input.nextInt();
        System.out.println("Indique agora um valor de fim: ");
        valorFim=input.nextInt();


        while (valorInicio<=valorFim){
        System.out.println(valorInicio);
        valorInicio = valorInicio +1;}


    }
}
