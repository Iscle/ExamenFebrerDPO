package me.iscle;

public class Puntuacio extends Valoracio {

    private double puntuacio;

    public Puntuacio(Usuari usuari, Avaluable avaluable, double puntuacio) {
        super(usuari, avaluable);
        this.puntuacio = puntuacio;
    }

    public double getPuntuacio() {
        return puntuacio;
    }
}
