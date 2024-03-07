package Ficha_05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] num = new int[10];
        int maiorElem;

        //Ler elemento
        for (int i=0; i< num.length;i++){
            System.out.println("Insira um valor:");
            num[i] = input.nextInt();
        }
        maiorElem=num[0];

        for (int i=0; i< num.length;i++){
            if (num[i]>maiorElem){
                maiorElem=num[i];
            }
        }
        System.out.println("O maior elemento é: " +maiorElem);



        }
    }
