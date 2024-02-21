package Ficha_02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        double nota1, nota2, nota3, media;

        // Ler notas
        System.out.println("Digite as suas 3 notas da avaliação à disciplina:");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();


            media = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);



        System.out.println("A sua média à disciplina é de: " + media);





}}
