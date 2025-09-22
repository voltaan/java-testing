public class MinimoComune {
     /**
     * Calcola il minimo comune multiplo di 2 numeri.
     *
     * @param x Numero 1.
     * @param y Numero 2.
     * @return Il minimo comune multiplo dei numeri dati.
     */
    public static int mcm(int x, int y) {
        return (x * y)/mcd(x,y);
    }

    /**
     * Calcola il massimo comune divisore di 2 numeri.
     *
     * @param x Numero 1.
     * @param y Numero 2.
     * @return Il massimo comune divisore dei numeri dati.
     */
    public static int mcd(int x, int y) {
        int resto;
        while (y != 0) {
            resto = x % y;
            x = y;
            y = resto;
        }
        return x;
    }
}
