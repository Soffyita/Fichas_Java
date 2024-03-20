package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {
//Ler um ficheiro CSV com info de vendas e calcular valor total das vendas
    public static void totalVendas(String path) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path) );

        String linha = leitura.nextLine(); // linha do cabeçalho

        Double total=0;

        while (leitura.hasNextLine()){
            linha = leitura.nextLine();
            String[] itensDaLinha = linha.split(",");

            Double totalLinhaAtual = (Double.parseDouble(itensDaLinha[2])) * (Double.parseDouble(itensDaLinha[3]);
            total+=totalLinhaAtual;
            }
        return total;
        }
}
        leitura.close();



    public static void main(String[] args) throws FileNotFoundException{

        totalVendas("Ficheiros/exercicio_08.csv");
        System.out.println("O valor total das vendas é de: " + total + "€");
    }
}
