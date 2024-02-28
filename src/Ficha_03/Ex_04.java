package Ficha_03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, inicio;

        //Ler número
        System.out.println("Introduza um número por favor: ");
        num = input.nextInt();
        inicio = 0;

        //Ler o resultado
        while (num <= inicio) {
            System.out.println(num);
            num = num +1 ;
        }


    }
}
