package Ficha_06;

import java.util.Scanner;

import static Ficha_06.Ex_05.*;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("**********Análise de um Vetor**********");
        System.out.println();

        int tamanhoVetor, opcao;


        System.out.println("Indique o tamanho do vetor que deseja preencher: ");
        tamanhoVetor= input.nextInt();

        int [] vetor = new int [tamanhoVetor];

        for (int k = 0; k < vetor.length; k++) {
            System.out.print("Insira um número no vetor [" + k + "]: ");
            vetor [k] = input.nextInt();
        }

        for (int k = 0; k < vetor.length; k++) {
            System.out.println("vetor[" + k + "]: " + vetor[k]);
        }

        do {

            // Apresentar as opções
            System.out.println("\n\n****** Análise de um Vetor: *******\n");
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("4. Sair!");

            // Ler opcao
            System.out.print("\nInsira uma opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao){

                case 1: // Maior Elemento

                    System.out.println("*** Maior Elemento ***: "+ maior(vetor));

                    break;

                case 2: // Menor Elemento

                    System.out.println("*** Menor Elemento ***: "+ menor(vetor));

                    break;

                case 3: // Crescente ou Não Crescente

                    if(crescente(vetor)){
                        System.out.println("*** Crescente ***");
                    }else{
                        System.out.println("*** Não Crescente ***");
                    }

                    break;

                case 4: // Sair
                    System.out.println("*** Até à Próxima! :D ***");
                    break;

                default:
                    System.out.println("Opção Inválida!\n");
            }


        } while (opcao != 4);

    }
}

