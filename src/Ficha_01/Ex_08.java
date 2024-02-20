package Ficha_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mm1, sm1, mm2, sm2, mm3, sm3, mm4, sm4, mm5, sm5, ht, mt, st;

        mm1 = 15;
        sm1 = 10;

        mm2 = 12;
        sm2 = 30;

        mm3 = 5;
        sm3 = 50;

        mm4 = 10;
        sm4 = 50;

        mm5 = 20;
        sm5 = 0;

        st = (sm1 + sm2 +sm3 + sm4 +sm5)  % 60;
        mt = ((mm1 + mm2 +mm3 + mm4 + mm5) % 60) + ((sm1 + sm2 +sm3 + sm4 + sm5) / 60);
        ht = (mm1 + mm2 +mm3 + mm4 + mm5) / 60;

        System.out.println("Total do Álbum: " + ht + ":" + mt + ":" + st);


    }
}
