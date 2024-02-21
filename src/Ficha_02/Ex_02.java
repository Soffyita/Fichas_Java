package Ficha_02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Digite o seu salário anual bruto: ");
        salario = input.nextDouble();


        if (salario > 15000) {

            System.out.println("Impostos de 30%: " + (salario * 0.3));
        } else {
            System.out.println("Impostos de 20%: " + (salario * 0.2));
        }
    }
}
