package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {

        //Instanciar o ficheiro
        File file = new File("Ficheiros/exercicio_07.txt");

        // Instanciar um Scanner para as linhas e outro para as palavras
        Scanner leitorLinhas = new Scanner(file);
        Scanner leitorPalavras = new Scanner(file);

        //Declarar variáveis
        int somaLinhas =0, somaPalavras=0;

        while (leitorLinhas.hasNextLine()) {
            somaLinhas = somaLinhas+1;
            leitorLinhas.nextLine();
        }

        while (leitorPalavras.hasNext()) {
            somaPalavras = somaPalavras+1;
            leitorPalavras.next();
        }

        System.out.println("O ficheiro possui " +somaLinhas +" linhas.");
        System.out.println("O ficheiro possui " +somaPalavras +" palavras.");


    }
}