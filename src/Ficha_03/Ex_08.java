package Ficha_03;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, numAnt=-5, numSeg=+5;

        //Ler valores
        System.out.println("Indique, por favor, um número: ");
        num = input.nextInt();
        numAnt=num-5;
        numSeg=num+1;

        while (numAnt<num) {
            System.out.println(numAnt);
            numAnt=numAnt+1;
        }

        while ((numSeg>num) && (numSeg<num+6)) {
            System.out.println(numSeg);
            numSeg=numSeg+1;
        }




    }
}

