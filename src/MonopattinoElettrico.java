public class MonopattinoElettrico extends Veicolo {
    private double batteria;

    public MonopattinoElettrico(String id, Posizione posizione) {
        super(id, posizione);
        this.batteria = 0.0;
    }

    public double getBatteria() {
        return batteria;
    }

    public void setBatteria(double batteria) {
        this.batteria = batteria;
    }
}
