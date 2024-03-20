package Ficha_07;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Ficha_06.Ex_05.maior;

public class Ex_09 {
    public static void lerPlaylist(String path) throws FileNotFoundException{


    }

    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        do {

            // Apresentar as opções
            System.out.println("\n\n****** Menu de músicas: *******\n");
            System.out.println("1. Pesquisar música por género.");
            System.out.println("2. Pesquisar música por artista");
            System.out.println("3. Pesquisar a música com a maior duração");
            System.out.println("4. Pesquisar música de duração acima de: ");
            System.out.println("5. Saber quantas músicas estão na tua playlist.");
            System.out.println("6. Sair!");

            // Ler opcao
            System.out.print("\nInsira uma opção: ");
            int opcao = input();

            System.out.println();

            switch (opcao){

                case 1: // Género

                    System.out.println("*** Género a pesquisar ***: "+  ;

                    break;

                case 2: // Artista

                    System.out.println("*** Artista a pesquisar ***: "+  ;

                    break;

                case 3: // Maior Duração

                    System.out.println("*** Música com maior duração da tua playlist ***: "+  ;

                    break;

                case 4: // Duração à escolha

                    System.out.println("*** Música com duração especificada ***: "+  ;

                    break;

                case 1: // Sair

                    System.out.println("*** Sair ***: "+  ;

                    break;

    }
}
