package Ficha_ExtraCiclos;

public class Ex_04_01 {
    public static void main(String[] args) {
        /***************4.1*******************/

//        for (int h = 1; h <= 4; h++) {
//            System.out.println("**********");

        int linha = 4;
        int coluna = 10;

        for (int h = 0; h < linha; h++) {
            for (int k = 0; k < coluna; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}