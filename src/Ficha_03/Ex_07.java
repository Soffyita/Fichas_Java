package Ficha_03;

public class Ex_07 {
    public static void main(String[] args) {

        //Declarar constantes
        int numIn=1, soma=0;

        while (numIn<=100){
            System.out.println(numIn);
            soma=soma+numIn;
            numIn=numIn+1;
        }
        System.out.println("O somatório é: " +soma);
    }

}
