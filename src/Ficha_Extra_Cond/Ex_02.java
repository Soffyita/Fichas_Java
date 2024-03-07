package Ficha_Extra_Cond;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis

        double peso, pesoLua;

        //Ler o peso
        System.out.print("Indique o seu peso em (Kg): ");
        peso= input.nextDouble();

        // Calcular os resultados

        if (peso>=0) {
            pesoLua = (peso * 0.16);
            System.out.print("O seu peso na Lua é de aproximadamente " + pesoLua + " Kg");
        } else {
            System.out.println("Inseriu um peso não aceite!");
        }

    }
}
