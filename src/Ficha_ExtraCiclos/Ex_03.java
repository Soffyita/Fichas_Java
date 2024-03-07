package Ficha_ExtraCiclos;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {


        for (int h = 1; h <= 10; h++) {
            System.out.println("\nTabuada do " + h + ":");

            for (int k = 1; k <= 10; k++) {
                int resultado = h * k;
                System.out.println(h + "x" + k + "=" + resultado);
            }
            System.out.println();
        }

    }
}