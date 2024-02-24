package Ficha_02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int opcao;

        System.out.println("Selecione uma das opções (1, 2, 3, 4)");
        opcao = input.nextInt();

        switch (opcao) {
            case 1: System.out.println("Criar");
            break;

            case 2: System.out.println("Atualizar");
            break;

            case 3: System.out.println("Eliminar");
            break;

            case 4: System.out.println();
            break;

            default: System.out.println("Opção inválida");

        }

}}
