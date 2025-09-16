import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Utenti {
    ArrayList<Utente> arrayUtenti;

    public void Autenticazione() {
        Utente utenteCorrente = new Utente(null, null, null, 0);
        Scanner tastiera = new Scanner(System.in);
        try {
            System.out.print("Nome: ");
            String nomeUtente = tastiera.next();
            System.out.print("Cognome: ");
            String cognome = tastiera.next();
            System.out.print("Password: ");
            String password = tastiera.next();
            System.out.print("ID: ");
            int userId = Integer.parseInt(tastiera.next());

            boolean utenteTrovato = false; // Variabile per verificare se l'utente è stato trovato

            for (Utente utente : arrayUtenti) {
                // Usa .equals() per confrontare le stringhe
                if (nomeUtente.equals(utente.nome) && cognome.equals(utente.cognome) && password.equals(utente.password)
                        && userId == utente.userId) {
                    utenteCorrente = utente;
                    utenteTrovato = true; // Imposta a true se l'utente è trovato
                    break; // Esci dal ciclo se l'utente è trovato
                }
            }

            if (utenteTrovato) {
                System.out.println("Ciao " + utenteCorrente.nome + "!");
            } else {
                System.out.println("Utente non trovato.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No input available. Please provide the required input.");
        } catch (NumberFormatException e) {
            System.out.println("ID non valido. Assicurati di inserire un numero intero.");
        } finally {
            tastiera.close();
        }

    }

    public Utenti() {
        arrayUtenti = new ArrayList<Utente>();
        arrayUtenti.add(new Utente("Gio", "Vol", "1234", 1));
        arrayUtenti.add(new Utente("Riky360", "Trabu", "5678", 2));
    }
}
