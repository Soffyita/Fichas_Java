package Ficha_01;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;

        valor1 = 10;
        valor2 = 20;

        System.out.println("O valor de valor1 é: " + valor1);
        System.out.println("O valor de valor2 é: " + valor2);

        //System.out.println("Valor1: " + (valor1 * 2));
        //System.out.println("Valor2: " + (valor2 / 2));

        valor3 = valor1;
        valor1 = valor2;
        valor2 = valor3;

        System.out.println("Depois da troca o valor de valor1 é: " + valor1);
        System.out.println("Depois da troca o valor de valor2 é: " + valor2);
    }
}
