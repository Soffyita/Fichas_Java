package Ficha_06;

import java.util.Scanner;

public class Ex_07 {

    public static void square(String caracter, int line, int column) {

        int linha = 0;

        //Print top part of square
        for (int k = 0; k < column; k++) {
            System.out.print(caracter);
        }

        //Print inner of square (has to be empty)
        for (int k = 0; k < line; k++) {
            System.out.println(caracter);
        }

            //Print bottom part of square
        for (int k = 0; k < column; k++) {
              System.out.print(caracter);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String caracter;
        int line, column;

        System.out.println("Indique o caracter que deseja iterar: ");
        caracter=input.next();
        System.out.println("Indique quantas linhas deseja:");
        line=input.nextInt();
        System.out.println("Indique quantas colunas: ");
        column=input.nextInt();

        square(caracter, line, column);


    }
}
