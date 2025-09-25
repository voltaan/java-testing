import java.util.Scanner;

public class Potenza {
    /**
     * Punto di inizio del programma. Questo programma chiede il valore della base e dell'esponente all'utente e ne calcola il risultato.
     * @param args Argomenti di linea di comando (in questo programma non sono utilizzati)
     */
    public static void main(String[] args) {
        // Spiegazione di cosa fa il programma all'utente
        System.out.println("Questo programma calcola le potenze. Ti chiederà di inserire la base e l'esponente e eleverà all'esponente richiesto la base.");
        // Inizializzazione dello Scanner in modo da ricevere l'input dell'utente.
        Scanner tastiera = new Scanner(System.in);
        // Inizializzazione variabili base e esponente su cui andranno assegnati i valori.
        int base, esponente;
        // Questo pezzo di codice prova ad eseguire la funzione sottostante e se trova un eccezione (ad esempio se l'utente digita un valore che non è un numero intero) visualizza un messaggio d'errore.
        try {
            System.out.print("Inserire base: ");
            // Legge la prossima linea dello scanner e lo assegna alla base, convertendolo in un numero intero da stringa.
            base = Integer.parseInt(tastiera.nextLine());
            System.out.print("Inserire esponente: ");
            // Legge la prossima linea dello scanner e lo assegna all'esponente, convertendolo in un numero intero da stringa.
            esponente = Integer.parseInt(tastiera.nextLine());
            // In questo output viene richiamata una funzione che si trova alla fine di questo file. Essa calcola la potenza con la base e l'esponente.
            System.out.println("La potenza di " + base + " elevato alla " + esponente + " è " + CalcolaPotenza(base, esponente));
        } catch (Exception e) {
            // In caso qualcosa fosse 
            System.out.println("Oops... si è verificato un problema. Molto probabilmente hai digitato qualcosa che non era un numero intero.");
            System.out.println(e);
        } finally {
            // Chiude lo scanner.
            tastiera.close();
        }
    }

    /**
     * Funzione che calcola il risultato di una base elevata all'esponente.
     * @param base Numero base.
     * @param esponente Numero esponente.
     * @return Ritorna il risultato della potenza.
     */
    static int CalcolaPotenza(int base, int esponente){
        int risulato = 1;
        for(int i = 0; i<esponente; i++){
            risulato *= base;
        }
        return risulato;
    }
}