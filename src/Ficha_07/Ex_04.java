package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    public static void imprimirCSVConsola(String path) throws FileNotFoundException {

        //Instanciar um Scanner  para o Ficheiro que foi passado por parâmetro
        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }
    }

    public static void main(String[] args) {

        try {
            imprimirCSVConsola("Ficheiros/exercicio_04.csv");
        } catch (FileNotFoundException e) {

            System.out.println("Ficheiro Não Encontrado...");
        }
    }
}
