//package Ficha_ExtraCiclos;
//
//public class Ex_04_03 {
//    public static void main(String[] args) {
//        /***************4.3*******************/
//
//
//        int linha = 1;
//        int espaco = 1;
//        int asterisco =1
//
//        for (int h = 0; h < linha; h++) {
//            linha=linha+2;
//            for (int k = 9; k > coluna; k--) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//    }
//}
package FichaPraticaExtra_Ciclos;

public class Ex_04_03 {
    public static void main(String[] args) {
        int linhas = 5; // Número de linhas a serem impressas
        int espacos = linhas - 1; // Número inicial de espaços em cada linha
        int asteriscos = 1; // Número inicial de asteriscos em cada linha

        // Ciclo para cada linha
        for (int i = 0; i < linhas; i++) {

            // Imprimir espaços em branco
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            // Enter
            System.out.println();

            // Atualizar contadores de espaços e asteriscos para a próxima linha
            espacos--;
            asteriscos += 2;
        }
    }
}
