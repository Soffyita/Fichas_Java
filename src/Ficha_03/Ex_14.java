package Ficha_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num1, num2, rep = 1, qtd;
        boolean crescente=true;

        //Ler valores
        System.out.print("Quantos números deseja inserir: ");
        qtd = input.nextInt();
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        while (rep < qtd) {
            System.out.print("Introduza um número: ");
            num2 = input.nextInt();

            if (num1 >= num2) {
             crescente = false;
             }
            //num1 = num2;
            rep = rep + 1;

        }
if (crescente) { //if (crescente == true)
    System.out.println("Crescente");
}else {
    System.out.println("Não crescente!");
}


    }
}
