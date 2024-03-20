package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07_v2 {
    public static int contarLinhasFicheiro (String path) throws FileNotFoundException {
        int numeroLinhas=0;

        Scanner leitura =new Scanner(new File(path));

        while (leitura.hasNextLine()) {
        numeroLinhas++;
        leitura.nextLine();
    }
    return numeroLinhas;
}

public static int contarPalavrasFicheiro(String path) throws FileNotFoundException{
    int numeroPalavras=0;

    Scanner leitura =new Scanner(new File(path));

    while (leitura.hasNext()) {
        numeroPalavras++;
        leitura.hasNext();
    }
    return numeroPalavras;
    }

    public static void main(String[] args) {

        contarLinhasFicheiro("Ficheiros/exercicio_07.txt");
        contarPalavrasFicheiro("Ficheiros/exercicio_07.txt");

        System.out.println("O ficheiro possui: "+);
    }
}