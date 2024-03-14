package Ficha_Extra_Cond;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {


        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int guess=41, num;

        System.out.println("Vamos dar uma de Houdini!!!");
        System.out.println();
        System.out.println("Adivinhe o número (1 a 100):");
        num=input.nextInt();



        if (num<guess) {
            System.out.println("Estás a atirar muito para baixo!");
            System.out.println("Adivinhe o número (1 a 100):");
            num=input.nextInt();

            System.out.println();

        } else if (num>guess) {
            System.out.println("Ei lá! Também não é preciso atirar para o sol!");
            System.out.println("Adivinhe o número (1 a 100):");
            num=input.nextInt();


        } else if (num==guess) {
        System.out.println("Estás contratado! Passas a ser o mágico de serviço!");

        }
        System.out.println("Better Luck next time!");


    }
}

