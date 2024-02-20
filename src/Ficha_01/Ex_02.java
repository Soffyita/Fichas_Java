package Ficha_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        //Importar o scanner
        Scanner input = new Scanner(System.in);

       // Declarar variáveis
       double valor1, valor2, soma, subt, multi, div;

        //Ler valor1
        System.out.println("Insira um número inteiro");
        valor1 = input.nextDouble();

        //Ler valor2
        System.out.println("Insira outro número inteiro");
        valor2 = input.nextDouble();

        //Somar valor1 com valor2
        soma = valor1 + valor2;

        //Subtrair valor1 com valor2
        subt = valor1 - valor2;

        //Multiplicar valor1 com valor2
        multi = valor1 * valor2;

        //Dividir valor1 por valor2
        div = valor1 / valor2;

        //Apresentar resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subt);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Divisão: " + div );
    }
}
