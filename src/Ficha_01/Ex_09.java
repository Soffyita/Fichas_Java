package Ficha_01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double vencBaseLiq, vencBaseIl, SubAlim, IRS, SSf, SSp, codF, dias;

        System.out.println("Digite, por favor, o seu código de funcionário e o nº de dias trabalhados. ");
        codF = input.nextInt();
        dias = input.nextInt();

        vencBaseIl = dias * 40;
        SubAlim = dias * 5;
        IRS = vencBaseIl * 0.10;
        SSf = vencBaseIl * 0.11;
        SSp = vencBaseIl * 0.2375;
        vencBaseLiq = (vencBaseIl + SubAlim) - (IRS + SSf);




        System.out.println("O valor ilíquido do seu salário é: " + vencBaseIl + " €");
        System.out.println("O total do seu subsídio de alimentação é de: " + SubAlim + " €");
        System.out.println("Em fonte de IRS retém: " + IRS + " €");
        System.out.println("Para a Segurança Social desconta: " +SSf + " €");
        System.out.println("Já a sua entidade patronal desconta: " + SSp + " €");
        System.out.println("O que faz com que " + codF + " receba líquido: " + vencBaseLiq + " €");



    }
}
