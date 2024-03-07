package Ficha_ExtraCiclos;

public class Ex_04_02 {
    public static void main(String[] args) {
        /***************4.2*******************/

//

        int linha = 5;
        int coluna = 0;

        for (int h = 0; h < linha; h++) {
            coluna=coluna+1;
            for (int k = 0; k < coluna; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}