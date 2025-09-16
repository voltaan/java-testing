import java.util.Scanner;

public class MaxMin {

    /**
     * Calcola il masssimo e il minimo tra un array di numeri.
     *
     * @param numeri Array di numeri da calcolare.
     * @return Una stringa in cui dice il numero maggiore e il numero minore.
     */
    public static String calcola(int[] numeri) {
        int min = Integer.MAX_VALUE;
        int max = numeri[0];

        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] < min) {
                min = numeri[i];
            }
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        return "Il numero massimo è " + max + " e il numero minimo è " + min;
    }

    /**
     * L'inizializzazione della classe chiede all'utente quali numeri vuole inserire
     * nell'array e stampa il numero massimo e il numero minimo.
     *
     */
    public MaxMin() {
        System.out.println(
                "Benvenuto nel programma che calcola il numero massimo e il numero minimo! Per iniziare, digita i numeri qui sotto separati da uno spazio. Puoi inserire un massimo di 20 numeri.");
        Scanner tastiera = new Scanner(System.in);
        String stringaNumeri = tastiera.nextLine();
        tastiera.close();
        String[] arrayStringaNumeri = stringaNumeri.split(" ");
        int[] numeri = new int[arrayStringaNumeri.length];
        for (int i = 0; i < arrayStringaNumeri.length; i++) {
            numeri[i] = Integer.parseInt(arrayStringaNumeri[i]);
        }
        System.out.println(calcola(numeri));
    }
}
