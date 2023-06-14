public class Furgoncino  extends Veicolo {
    private String targa;
    private double carburante;

    public Furgoncino(String id, Posizione posizione, String targa) {
        super(id, posizione);
        this.targa = targa;
        this.carburante = 0.0;
    }

    public String getTarga() {
        return targa;
    }

    public double getCarburante() {
        return carburante;
    }

    public void setCarburante(double carburante) {
        this.carburante = carburante;
    }
}
