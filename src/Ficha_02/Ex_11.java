package Ficha_02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double valorMovimento, saldoAnterior, saldoAtual;

        System.out.println("*****Programa de Créditos/Débitos bancários *****");

        System.out.println("Indique por favor o saldo atual");
        saldoAnterior = input.nextDouble();

        System.out.println("Indique agora o montante que quer movimentar (crédito ou débito)");
        valorMovimento = input.nextDouble();

        saldoAtual = saldoAnterior + valorMovimento;

        if (saldoAtual >= 0) {
            System.out.println("O seu saldo atual é de: " + (valorMovimento + saldoAnterior));
        }
        else {
            System.out.println("Operação inválida: Saldo insuficiente." );
            System.out.println("Saldo Atual: " + saldoAnterior);
        }




    }
}
