package Ficha_03;

import java.util.Scanner;

public class Ex_15_a {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, fatorial;

        //Ler os valores
        System.out.println("Indique um número para cálculo do Fatorial: ");
        num = input.nextInt();
        fatorial = num;

        //Calcular
        while ((num > 1) && (num < 13)) {
            fatorial = fatorial * (num - 1);
            num = num - 1;

        }
        System.out.println("Fatorial: " + fatorial);
    }
}



