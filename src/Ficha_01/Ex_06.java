package Ficha_01;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite um número: ");
        valor1 = input.nextInt();
        System.out.println("Digite outro número: ");
        valor2 = input.nextInt();

        System.out.println("O valor de valor1 é: " + valor1);
        System.out.println("O valor de valor2 é: " + valor2);


        //valor3 = valor1;
        //valor1 = valor2;
        //valor2 = valor3;

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1- valor2;


        System.out.println("\nDepois da troca o valor de valor1 é: " + valor1);
        System.out.println("Depois da troca o valor de valor2 é: " + valor2);
    }
}
