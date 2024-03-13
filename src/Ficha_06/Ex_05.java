package Ficha_06;

public class Ex_05 {

    static int maior(int[] vetor) {

        int numMaior;

        numMaior = vetor[0];

        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] > numMaior) {
                numMaior = vetor[k];
            }
        }
        return numMaior;
    }

    static int menor(int[] vetor) {

        int numMenor;

        numMenor = vetor[0];

        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] < numMenor) {
                numMenor = vetor[k];
            }
        }
        return numMenor;
    }

    static boolean crescente(int[] vetor) {
        boolean crescente = true;

        for (int k = 1; k < vetor.length; k++) {
            if (vetor[k] <= vetor[k - 1]) {
                return false;
            }
        }
        return true;
    }


}



