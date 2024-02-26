package Ficha_02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        double saldoMedio;

        //Ler valor
        System.out.println("Qual é o valor do saldo médio da sua conta bancária?");
        saldoMedio = input.nextDouble();

        System.out.println("Saldo médio da conta: " + saldoMedio + " €");

        if ((saldoMedio >=0) && (saldoMedio <=2000)) {
            System.out.println("Não poderá ser concedido nenhum crédito!");}
        else {
            if ((saldoMedio >2000) && (saldoMedio <=4000)) {
                System.out.println("Poderá ser concedido 20% do valor " + (saldoMedio * 0.2) + "€" );}
            else {
                if ((saldoMedio >4000) && (saldoMedio <=6000)) {
                    System.out.println("Poderá ser concedido 30% do valor  " + (saldoMedio * 0.3) + "€" );}
                else {
                    if ((saldoMedio > 6000)) {
                        System.out.println("Poderá ser concedido 40% do valor" + (saldoMedio * 0.4) + "€" );}
                    }
                }
                }

            }
        }


