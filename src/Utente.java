public class Utente {
    String nome;
    String cognome;
    String password;
    int userId;

    /**
     * Inizializza un nuovo utente come un oggetto.
     * 
     * @param nome Nome dell'utente.
     * @param cognome Cognome dell'utente.
     * @param password Password dell'utente (Non sicura poiché non criptata).
     * @param userId Numero identificativo dell'utente.
     */
    public Utente(String nome, String cognome, String password, int userId){
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.userId = userId;
    }
}
