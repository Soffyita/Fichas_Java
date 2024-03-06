package Ficha_04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double num1, num2;
        String oper, continuar;

        do {

            System.out.println("Indique, por favor, um número");
            num1 = input.nextDouble();
            System.out.println("Indique agora outro número: ");
            num2 = input.nextDouble();

            System.out.println("Indique agora que operação (*, +, -, /) deseja realizar entre estes 2 números:");
            oper = input.next();

            switch (oper) {
                case "+":
                    System.out.println("A soma dos dois números é: " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("A subtração dos dois números é: " + (num1 - num2));
                    break;

                case "/":
                    System.out.println("A divisão dos dois números é: " + (num1 / num2));
                    break;

                case "*":
                    System.out.println("A multiplicação dos dois números é: " + (num1 * num2));
                    break;

                default:
                    System.out.println("Inseriu uma operação aritmética não reconhecida!");

            }
            do { //tenho que executar este passo para verificar a condição, se introduzo s ou n, ou seja, pergunta até que introduzas um dos dois s/n
                //equalsIgnoreCase para ignorar se é maiuscula ou minuscula

                System.out.println("Deseja continuar? (Introduza s para Sim / n para Não). ");
                continuar = input.next();
            }
            while (!continuar.equals("s") && !continuar.equals("n"));


        } while (continuar.equals("s"));


    }
}