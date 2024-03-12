package Ficha_06;

import java.util.Scanner;

import static Ficha_06.Ex_05..*;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("**********Análise de um Vetor**********");
        System.out.println();

        int[] vetor = new int[10];
        int opcao;

        for (int k = 0; k < 10; k++) {
            System.out.print("Insira um número no vetor [" + k + "]: ");
            vetor[k] = input.nextInt();
        }

        for (int k = 0; k < 10; k++) {
            System.out.println("vetor[" + k + "]: " + vetor[k]);
        }

        do {

            // Apresentar as opções
            System.out.println("\n\n****** Análise de um Número: " + vetor + " ******\n");
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente ou Não Crescente");

            // Ler opcao
            System.out.print("Insira uma opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao){

                case 7: // Maior Elemento

                    if maior(int[] vetor){
                        System.out.println("*** Maior Elemento ***");
                    }else{
                        System.out.println("*** Impar ***");
                    }

                    break;

                case 8: // Menor Elemento

                    if(positivo(numero)){
                        System.out.println("*** Positivo ***");
                    }else{
                        System.out.println("*** Negativo ***");
                    }

                    break;

                case 9: // Crescente ou Não Crescente

                    if(primo(numero)){
                        System.out.println("*** Primo ***");
                    }else{
                        System.out.println("*** Não Primo ***");
                    }

                    break;



                default:
                    System.out.println("Opção Inválida!\n");
            }


        } while (opcao != 10);

    }
}
    }
}
