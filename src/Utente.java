public class Utente {
    public String nome;
    public String cognome;
    public String password;
    int userId;
    public Utente(String nome, String cognome, String password, int userId){
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.userId = userId;
    }
}
