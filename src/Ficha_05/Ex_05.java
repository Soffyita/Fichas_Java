package Ficha_05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        double[] num = new double[10];
        double somatorio = 0, media;

        //Ler elemento
        for (int i = 0; i < num.length; i++) {
            System.out.println("Insira um valor:");
            num[i] = input.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            somatorio = num[i];
        }
        media = somatorio/ num.length;

        System.out.println("A média dos valores introduzidos é: " + media);
    }
}