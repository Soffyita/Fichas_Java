package Ficha_02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num1, num2, num3;
        String ordem;

        System.out.println("Indique por favor 3 números.");
        System.out.println("Primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Segundo número: ");
        num2 = input.nextInt();

        System.out.println("Terceiro número: ");
        num3 = input.nextInt();

        System.out.println("Agora indique, por favor, " +
                "qual a ordem que deseja organizar os números (C - crescente / D - decrescente:)");
        ordem = input.next();

        switch (ordem) {
            case "C":
                if ((num1 <= num2) && (num1 <= num3) && (num2 <= num3)) {
                    System.out.println("A ordem correta é: " + num1 + " " + num2 + " " + num3);
                } else {
                    if ((num1 <= num3) && (num1 <= num2) && (num3 <= num2)) {
                        System.out.println("A ordem correta é: " + num1 + " " + num3 + " " + num2);
                    } else {
                        if ((num2 <= num3) && (num2 <= num1) && (num3 <= num1)) {
                            System.out.println("A ordem correta é: " + num2 + " " + num3 + " " + num1);
                        } else {
                            if ((num2 <= num1) && (num2 <= num3) && (num1 <= num3)) {
                                System.out.println("A ordem correta é: " + num2 + " " + num1 + " " + num3);
                            } else {
                                if ((num3 <= num2) && (num3 <= num1) && (num2 <= num1)) {
                                    System.out.println("A ordem correta é: " + num3 + " " + num2 + " " + num1);
                                } else {
                                    if ((num3 <= num1) && (num3 <= num2) && (num1 <= num2)) {
                                        System.out.println("A ordem correta é: " + num3 + " " + num1 + " " + num2);
                                    }
                                }


                            }
                        }
                    }
                };
                break;

            case "D":
                if ((num1 >= num2) && (num1 >= num3) && (num2 >= num3)) {
                    System.out.println("A ordem correta é: " + num1 + " " + num2 + " " + num3);
                } else {
                    if ((num1 >= num3) && (num1 >= num2) && (num3 >= num2)) {
                        System.out.println("A ordem correta é: " + num1 + " " + num3 + " " + num2);
                    } else {
                        if ((num2 >= num3) && (num2 >= num1) && (num3 >= num1)) {
                            System.out.println("A ordem correta é: " + num2 + " " + num3 + " " + num1);
                        } else {
                            if ((num2 >= num1) && (num2 >= num3) && (num1 >= num3)) {
                                System.out.println("A ordem correta é: " + num2 + " " + num1 + " " + num3);
                            } else {
                                if ((num3 >= num2) && (num3 >= num1) && (num2 >= num1)) {
                                    System.out.println("A ordem correta é: " + num3 + " " + num2 + " " + num1);
                                } else {
                                    if ((num3 >= num1) && (num3 >= num2) && (num1 >= num2)) {
                                        System.out.println("A ordem correta é: " + num3 + " " + num1 + " " + num2);
                                    }
                                }


                            }

                        }
                    }
                }
        }
    }
}


