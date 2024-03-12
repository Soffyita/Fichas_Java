package Ficha_05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar;
        boolean jaTemPar = false; //utilizamos esta variável para ser um gatilho e criamos um espaço para entrar um n par à vontade

        System.out.println("**************************");

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maiorPar = -1;

        // Encontrar o maior par
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) { //colocar o primeiro par que me aparecer

                if (!jaTemPar) {  //o ponto de exclamação é para negar a expressão. coloca a questão se é falso
                    maiorPar = vetor[i];//sem esta linha o par ia entrar sempre nesta condição
                    jaTemPar=true;
                }

                if (vetor[i] > maiorPar) { //encontrar o maior par
                    maiorPar = vetor[i];
                }

            }
        }

        // Apresentar o maior par
        if(maiorPar%2==0){
            System.out.println("Maior Par: "+maiorPar);
        }else{
            System.out.println("Não tem pares!");
        }
    }

}
