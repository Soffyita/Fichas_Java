package Ficha_06;

import java.util.Scanner;

public class Ex_01 {

    public static void fazerBarulho(String animal) {
        switch (animal.toLowerCase()) {
            case "cao" :
                System.out.println("Au au au");
                break;

            case "gato" :
                System.out.println("Miau");
                break;

            case "Peixe":
                System.out.println("Glub Glub");
                break;

            case "Vaca":
                System.out.println("Muuuu");
                break;

            case "Porco":
                System.out.println("Oinc oinc");
                break;

            default:
                System.out.println("Indicou um animal cujo barulho desconhecemos!");

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String escolherAnimal;

        System.out.println("Indique o nome de um animal: ");
        escolherAnimal= input.next();
        System.out.println("*****SOM*****");
        fazerBarulho(escolherAnimal);


    }




}
