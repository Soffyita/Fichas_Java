package Ficha_03;

import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {


        // Importar scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num, int1 = 0, int2 = 0, int3 = 0, int4 = 0;


        System.out.println("Indique um número por favor");
        num = input.nextInt();

        while (num > 0) {

            if ((num >= 0) && (num <= 25)) {
                int1 = int1 + 1;
            } else {
                if ((num >= 26) && (num <= 50)) {
                    int2 = int2 + 1;
                } else {
                    if ((num >= 51) && (num <= 75)) {
                        int3 = int3 + 1;
                    } else {
                        if ((num >= 76) && (num <= 100)) {
                            int4 = int4 + 1;
                        }
                    }
                }
            }
            System.out.println("Indique outro número, por favor");
            num = input.nextInt();
        }

        System.out.println("[00, 25]: " + int1);
        System.out.println("[26, 50]: " + int2);
        System.out.println("[51, 75]: " + int3);
        System.out.println("[76, 100]: " + int4);
    }

}