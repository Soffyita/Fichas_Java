package Ficha_05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double[] comissoes = new double[12];
        double valorAnual=0;

        //Ler comissões
        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Insira o valor da comissão do mês [" + i + "]");
            comissoes[i] = input.nextDouble();
        }

//        //Imprimir comissões
//        for (int i = 0; i < comissoes.length; i++) {
//            System.out.println("comissoes[" + i + "]: " + comissoes[i]);
//        }

        //Imprimir total de comissões
        for (int i = 0; i < comissoes.length; i++) {
            valorAnual=valorAnual+comissoes[i];
        }

        System.out.println("O valor anual das comissões é de: 2" +valorAnual + " €");

    }
}