package Ficha_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int opcao;

        do { //\n para dar espaço
            System.out.println("1- Criar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Sair");

            System.out.println("Insira uma opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolheu Criar ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Escolheu Atualizar ");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Escolheu Eliminar ");
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
            }

        }
        while (opcao != 4);
    }
}