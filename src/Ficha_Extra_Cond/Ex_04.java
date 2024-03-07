package Ficha_Extra_Cond;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        String letra;

        //Ler letra
        System.out.println("Indique, por favor, uma letra do alfabeto.");
        letra= input.next();

        if ((letra.equals ("a")) || (letra.equals("e")  || (letra.equals ("i")) || (letra.equals("o")) || (letra.equals("u")))) {
            System.out.println("A letra que escolheu é uma vogal");
        } else {
            System.out.println("A letra que escolheu é uma consoante!");
        }

    }
}