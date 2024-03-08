package Ficha_ExtraCiclos;

public class Ex_04_03 {
    public static void main(String[] args) {
        int linhas = 5; // Número de linhas a serem impressas
        int espacos = 4; // Número inicial de espaços em cada linha
        int colunas = 1; // Número inicial de asteriscos em cada linha

        // Ciclo para cada linha
        for (int h = 0; h < linhas; h++) {

            // Imprimir espaços em branco
            for (int k = 0; k < espacos; k++) {
                System.out.print(" ");

            }
            espacos--;

            // Imprimir asteriscos
            for (int m = 0; m < colunas; m++) {
                System.out.print("*");

            }
            colunas=colunas+2;

            // Enter
            System.out.println();

        }
    }
}
