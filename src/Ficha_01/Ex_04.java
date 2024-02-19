package Ficha_01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, pi, raio;

        pi = 3.1415;

        System.out.println("Indique o valor do raio");
        raio = input.nextInt();

        area = pi * (raio*raio);

        System.out.println("Área: " + area);

    }
}
