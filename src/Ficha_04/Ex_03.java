package Ficha_04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int valor1, valor2, contador=0;

        System.out.println("Indique um valor entre 1 e 100.");
        valor1 = input.nextInt();

        do {
            System.out.println("Tente adivinhar o valor introduzido (entre 1 e 100.)");
            valor2 = input.nextInt();
            if (valor2 < valor1) {
                System.out.println("O valor está abaixo!");
                System.out.println();
            } else if (valor2 > valor1){
                 System.out.println("O valor está acima!");
                    System.out.println();
                 }
            contador++;
        }
        while (valor2 != valor1);

        System.out.println();

        System.out.println("Parabéns! Realizaste " + contador + " tentativa(s)");

    }
}
