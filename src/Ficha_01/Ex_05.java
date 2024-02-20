package Ficha_01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2, valor3, mediaArt, mediaPon;

        System.out.println("Digite a primeira nota");
        valor1 = input.nextDouble();

        System.out.println("Digite a segunda nota");
        valor2 = input.nextDouble();

        System.out.println("Digite a terceira e última nota");
        valor3 = input.nextDouble();

        mediaArt = (valor1 + valor2 + valor3)/3;
        mediaPon = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);

        System.out.println("A média aritmética das notas acima é: " + mediaArt);
        System.out.println("A média ponderada das notas acima é: " + mediaPon);
    }
}
