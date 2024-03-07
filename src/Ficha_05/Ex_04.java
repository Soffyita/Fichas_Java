package Ficha_05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);


            //Declarar variáveis
            int[] num = new int[10];
            int menorElem;

            //Ler elemento
            for (int i=0; i< num.length;i++){
                System.out.println("Insira um valor:");
                num[i] = input.nextInt();
            }
            menorElem=num[0];

            for (int i=0; i< num.length;i++){
                if (num[i]<menorElem){
                    menorElem=num[i];
                }
            }
            System.out.println("O menor elemento é: " +menorElem);



        }
    }
