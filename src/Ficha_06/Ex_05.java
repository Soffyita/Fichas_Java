package Ficha_06;

public class Ex_05 {

    static int maior(int[] vetor) {

        int numMaior = 0;

        numMaior = vetor[0];

        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] > numMaior) {
                numMaior = vetor[k];
            }
        }
        return numMaior;
    }

    static int menor(int[] vetor) {

        int numMenor = 0;

        numMenor = vetor[0];

        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] > numMenor) {
                numMenor = vetor[k];
            }
        }
        return numMenor;
    }


}

