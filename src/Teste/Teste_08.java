package Teste;

import java.util.Scanner;

public class Teste_08 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("In n int posi N:");
        num = input.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println (num +"x"+ i + "=" + (num*i));
        }
    }

}
