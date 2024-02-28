package Ficha_02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        double dias;
        int codF;
        String cargo;


        System.out.println("Digite, por favor, o seu código de funcionário: ");
        codF = input.nextInt();
        System.out.println("Quantos dias trabalhou este mês?");
        dias = input.nextDouble();
        System.out.println("Informe agora, por favor, o cargo que exerce, utilizando a inicial do mesmo. ");
        cargo = input.next();

        //switch (cargo){
            //case "E":
             //   System.out.println("O valor ilíquido do seu salário é: " + (dias * 40) + " €");
             //   System.out.println("O total do seu subsídio de alimentação é de: " + (dias * 5) + " €");
            //    System.out.println("Em fonte de IRS retém: " + (dias * 40) * 0.10 + " €");
             //   System.out.println("Para a Segurança Social desconta: " + (dias * 40) * 0.11 + " €");
             //   System.out.println("Já a sua entidade patronal desconta: " + (dias * 40) * 0.2375 + " €");
             //   System.out.println("O que faz com que " + codF + " receba líquido: " + ((dias * 40) + (dias * 5)) - (((dias * 40) * 0.10) + ((dias*40) * 0.11)) +" €");
             //   break;

           // case "C":
              //  System.out.println("O valor ilíquido do seu salário é: " + (dias * 60) + " €");
             //   System.out.println("O total do seu subsídio de alimentação é de: " + (dias * 7.5) + " €");
             //   System.out.println("Em fonte de IRS retém: " + (dias * 60) * 0.20 + " €");
              //  System.out.println("Para a Segurança Social desconta: " + (dias * 60) * 0.11 + " €");
              //  System.out.println("Já a sua entidade patronal desconta: " + (dias * 60) * 0.2375 + " €");
              //  System.out.println("O que faz com que " + codF + " receba líquido: " + ((dias * 60) + (dias * 7.5)) - ((dias * 60) * 0.20) - ((dias*60) * 0.11) +" €");
             //   break;

          //  case "A" :
              //  System.out.println("O valor ilíquido do seu salário é: " + (dias * 80) + " €");
              //  System.out.println("O total do seu subsídio de alimentação é de: " + (dias * 7.5) + " €");
              //  System.out.println("Em fonte de IRS retém: " + (dias * 80) * 0.20 + " €");
              //  System.out.println("Para a Segurança Social desconta: " + (dias * 80) * 0.09 + " €");
              //  System.out.println("Já a sua entidade patronal desconta: " + (dias * 80) * 0.21 + " €");
              //  System.out.println("O que faz com que " + codF + " receba líquido: " + ((dias * 80) + (dias * 7.5)) - ((dias * 80) * 0.20) - ((dias*80) * 0.09) +" €");
              //  break;
        }





    }


