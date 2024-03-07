package Ficha_Extra_Cond;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int idade;

        //Ler valores
        System.out.println("Indique a sua idade, por favor: m");
        idade = input.nextInt();

        //Calcular resultado
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }
    }
}
