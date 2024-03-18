package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    public static void lerFicheiroGravarNoutroFicheiro (String caminho) throws FileNotFoundException {

        File sourceFile = new File(caminho);
        File newFile = new File ("Ficheiros/exercicio_03_Copia.txt");

        Scanner leitorFicheiro = new Scanner(sourceFile);
        PrintWriter maquinaEscrever = new PrintWriter(newFile);



        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            maquinaEscrever.println(linha);
        }

        leitorFicheiro.close();
        maquinaEscrever.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        lerFicheiroGravarNoutroFicheiro("Ficheiros/exercicio_03_Copia.txt", "");

    }

}
