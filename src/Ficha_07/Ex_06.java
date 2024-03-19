package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void imprimirMaisVelho(String path) throws FileNotFoundException {

        //Instanciar um ficheiro
        File file = new File(path);

        //Instanciar um Scanner  para o Ficheiro que foi passado por parâmetro
        Scanner leitorFicheiro = new Scanner(new File(path));

        //Declarar as variáveis

        String linha, linhaNome;
        int

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }
    }

    }
}
