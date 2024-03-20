package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    public static int somaNumInt (String path) throws FileNotFoundException {
        //Instanciar o ficheiro
        File file = new File(path);

        //Instanciar o Scanner
        Scanner leitorFicheiro = new Scanner(new File(path));


        //Declarar as variáveis
        int soma=0;

        while (leitorFicheiro.hasNextLine()) {
           int num = leitorFicheiro.nextInt();
            soma = soma + num;
        }

        //Fechar scanner
        leitorFicheiro.close();

        return soma;

    }
    public static void main(String[] args) throws FileNotFoundException {

        int soma;

        soma=somaNumInt("Ficheiros/exercicio_05_1999.txt");

        System.out.println("Soma dos números: "+soma);

    }
}
