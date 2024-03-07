package Ficha_05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int[] num = new int[10];
        int maiorValorPar;

        for (int a = 0; a < num.length; a++) {
            System.out.println("Insira um número no vetor [" + a + "]");
            num[a] = input.nextInt();
        }
        maiorValorPar =num[0];

        for (int a = 0; a < num.length; a++) {
            if ((num[a]>maiorValorPar) && (num[a]%2==0)) {
                maiorValorPar = num[a];
            }else{
                System.out.println("Não existe maior valor par!");
            }
            System.out.println("O maior valor par é: " +maiorValorPar);
        }
    }
}