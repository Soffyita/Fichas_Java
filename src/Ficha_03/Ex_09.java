package Ficha_03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {


        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, divisor=0, soma=0;

        System.out.println("Indique um número por favor");
        num=input.nextInt();

        while (num!=-1){
            soma=soma+num;
            divisor=divisor+1;
            System.out.println("Indique outro número, por favor");
            num=input.nextInt();

        }
        //System.out.println("A soma é: "+soma);
        //System.out.println("O divisor é: "+divisor);
        System.out.println("A média é de: " + (soma/divisor));
    }

}


