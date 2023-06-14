public class Veicolo {
    private final String id;
    private final Posizione posizione;
    private boolean affittato;

    public Veicolo(String id, Posizione posizione) {
        this.id = id;
        this.posizione = posizione;
        this.affittato = false;
    }

    public String getId() {
        return id;
    }

    public Posizione getPosizione() {
        return posizione;
    }


    public boolean isAffittato() {
        return affittato;
    }

    public void setAffittato(boolean affittato) {
        if (affittato) this.affittato = true;
        else this.affittato = false;
    }
}
