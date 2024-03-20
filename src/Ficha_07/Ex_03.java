package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static Ficha_07.Ex_01.imprimirFicheiroConsola;
import static Ficha_07.Ex_02.criarFicheiroDeTextoComMensagem;

public class Ex_03 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            imprimirFicheiroConsola("Ficheiros/exercicio_03.txt");
            criarFicheiroDeTextoComMensagem("Ficheiros/exercicio_03_copia.txt", "A criar um novo ficheiro.");

        } catch (FileNotFoundException e)
            {

                System.out.println("Ficheiro Não Encontrado...");
        }

    }

}
