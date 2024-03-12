package Ficha_06;

public class Ex_03 {
    /**
     * Método que avalia se um número é ou não impar
     *
     * @param num Número a ser avaliado
     * @return True - se par || False - se impar
     */
    public static boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um um número é positivo
     *
     * @param num - Número a ser avaliado
     * @return True - se zero ou positivo || False - se negativo
     */
    public static boolean positivo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um número é ou não primo
     *
     * @param num Número a ser avaliado
     * @return True - se primo || False - se não primo
     */
    public static boolean primo(int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean perfeito(int num) {
        int somaDivisores = 0;
        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                somaDivisores += divisor;
            }
        }
        if (somaDivisores == num) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean triangular(int num) {

        int somaInteiros = 0, contador = 1;

        while (somaInteiros < num) {
            somaInteiros = somaInteiros + contador;
            contador++;

            if (somaInteiros == num) {
                return true;
            }
        }
                return false;
            }


    }






