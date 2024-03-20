package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06_Li {
          public static void main(String[] args) throws FileNotFoundException{

              //Instanciar o ficheiro
              File file = new File("Ficheiros/exercicio_06.txt");

                // Instanciar um Scanner para o arquivo
                Scanner leitorFicheiro = new Scanner(new File("Ficheiros/exercicio_06.txt"));

                // Variáveis para armazenar a pessoa mais velha
                String nomeMaisVelho = "";
                int idadeMaisVelha = 0;

                // Iterar sobre cada linha do arquivo
                while (leitorFicheiro.hasNextLine()) {
                    String linha = leitorFicheiro.nextLine();
                    String[] linhaNome = linha.split(",");

                    // Verificar se a linha foi dividida corretamente em nome e idade
                    if (linhaNome.length == 2) {
                        String nome = linhaNome[0];
                        int idade = Integer.parseInt(linhaNome[1].trim()); // Converter a idade para int

                        // Comparar as idades para determinar a pessoa mais velha
                        if (idade > idadeMaisVelha) {
                            nomeMaisVelho = nome;
                            idadeMaisVelha = idade;
                        }
                    }
                }

                // Imprimir o nome da pessoa mais velha
                System.out.println("A pessoa mais velha é: " + nomeMaisVelho);

                // Fechar o Scanner
                leitorFicheiro.close();


            }
        }

