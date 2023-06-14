import java.awt.*;

public class Utente {
    private final String id;
    private final String nome;
    private final String cognome;
    private final String dataDiNascita;
    private final String codiceFiscale;
    private int Patenti;
    private final List patenti = new List(Patenti);
    private boolean haCasco;
    private double credito;

    public Utente(String id, String nome, String cognome, String dataDiNascita, String codiceFiscale) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.codiceFiscale = codiceFiscale;
        this.haCasco = false;
        this.credito = 0.0;

    }

    public String getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public String getCognome() {

        return cognome;
    }

    public String getDataDiNascita() {

        return dataDiNascita;
    }

    public String getCodiceFiscale() {

        return codiceFiscale;
    }

    public List getPatenti() {
        return  patenti;
    }

    public boolean haCasco() {
        return haCasco;
    }

    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }

    public double getCredito() {
        return credito;
    }

    public void aggiungiCredito(double importo) {
        credito = credito + importo;
    }
}


