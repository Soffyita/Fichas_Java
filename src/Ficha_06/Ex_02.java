package Ficha_06;

import java.util.Scanner;

public class Ex_02 {


    /**
     * Método que lê um inteiro positivo do utilizador
     * @return Número Inteiro Positivo
     */
    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);

        int num;

        do{
            System.out.print("Insira um número inteiro positivo: ");
            num=input.nextInt();
        }while(num<0);

        return num;
    }


    /**
     * Método que imprime uma quantidade de asteriscos recebida como parâmetro
     * @param numeroAsteriscos - Número de Asteriscos a Imprimir na Consola
     */
    public static void imprimirAsteriscos(int numeroAsteriscos){

        for(int i=0; i<numeroAsteriscos; i++){
            System.out.print("*");
        }

    }


    public static void main(String[] args) {

        imprimirAsteriscos(lerInteiroPositivo());

    }

}