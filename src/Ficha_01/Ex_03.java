package Ficha_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 double base, altura, area, perimetro;

        System.out.println("Indique o valor da base");
        base = input.nextDouble();

        System.out.println("Indique o valor da altura");
        altura = input.nextDouble();

        area = base * altura;

        perimetro = 2 * (base+altura);

        System.out.println("Área: "+ area + " m2");
        System.out.println("Perímetro: " + perimetro);
    }
}
