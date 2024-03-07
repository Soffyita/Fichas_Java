package Ficha_03;

import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {


        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int limite, salto, inicio = 0;

        //Ler valores
        System.out.println("Introduza um limite: ");
        limite = input.nextInt();
        System.out.println("Introduza um salto: ");
        salto = input.nextInt();

        //Revelar resultados
        while (inicio <= (limite-salto)) {
            System.out.println(inicio + salto);
            inicio=inicio+salto;
        }
    }
}
