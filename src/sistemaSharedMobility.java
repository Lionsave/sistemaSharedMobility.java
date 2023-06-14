import java.util.ArrayList;
import java.util.List;

class sistemaSharedMobility {
    private List<Veicolo> flotta;
    private List<Utente> utenti;


    public sistemaSharedMobility() {
        this.flotta = new ArrayList<>();
        this.utenti = new ArrayList<>();
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        flotta.add(veicolo);
    }

    public void aggiungiUtente(Utente utente) {
        utenti.add(utente);
    }

    public List<Veicolo> cercaVeicoliDisponibili() {
        List<Veicolo> veicoliDisponibili = new ArrayList<>();
        for (Veicolo veicolo : flotta) {
            if (!veicolo.isAffittato()) {
                veicoliDisponibili.add(veicolo);
            }
        }
        return veicoliDisponibili;
    }

    public void affittaVeicolo(Utente utente, Veicolo veicolo) {
        if (!veicolo.isAffittato()) {
            veicolo.setAffittato(true);
            System.out.println("Veicolo " + veicolo.getId() + " affittato dall'utente " + utente.getId());
        } else {
            System.out.println("Il veicolo " + veicolo.getId() + " non è disponibile per l'affitto.");
        }
    }

    public void restituisciVeicolo(Utente utente, Veicolo veicolo) {
        if (veicolo.isAffittato()) {
            veicolo.setAffittato(false);
            System.out.println("Veicolo " + veicolo.getId() + " restituito dall'utente " + utente.getId());
        } else {
            System.out.println("Il veicolo " + veicolo.getId() + " non è stato affittato.");
        }
    }
}