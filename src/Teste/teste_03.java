package Teste;

import java.util.Scanner;

public class teste_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;

        System.out.println("Insira a nota");
        nota= input.nextDouble();

        if (nota>=18) {
            System.out.println("Excelente");
        } else if (nota>=15) {
            System.out.println("Mtbom");
        } else if (nota>=12) {
            System.out.println("bom");
        } else if (nota>=

                9.5) {
            System.out.println("suf");
        } else {
            System.out.println("Nega");

        }
    }
}
