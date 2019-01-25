package me.iscle;

public class Infraestructura extends Avaluable {
    private String nom;
    private boolean esServei;

    public Infraestructura(String nom, boolean esServei, int count) {
        super(count);
        this.nom = nom;
        this.esServei = esServei;
    }

    public String getNom() {
        return nom;
    }

    public boolean isEsServei() {
        return esServei;
    }
}
