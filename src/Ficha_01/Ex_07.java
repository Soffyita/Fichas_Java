package Ficha_01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double prod1, prod2, prod3, total;

        System.out.println("Informe, por favor, o preço dos 3 produtos que adquiriu");

        prod1 = input.nextDouble();
        prod2 = input.nextDouble();
        prod3 = input.nextDouble();

        total = (prod1 + prod2 + prod3) * 0.90;

        System.out.println("O valor total das suas compras, com o desconto de fidelização é:  " + total + " €");




    }
}
