package Ficha_Extra_Cond;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double preco, desconto=0.10;

        //Ler o preço
        System.out.println("Digita, por favor, o preço do produto: ");
        preco= input.nextDouble();

        //Apresentar preço final
        if (preco>100) {
            desconto = preco*desconto;
            System.out.println("O valor do preço final com 10% de desconto é de: " + (preco - desconto) + " €");
        } else
            System.out.println("O valor final do seu produto é de: " + preco + " €");
        }

    }
