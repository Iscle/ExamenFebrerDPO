package me.iscle;

import java.awt.*;

public final class Ressenya extends Valoracio implements Recompensable {

    private String comentari;
    private Image[] imatges;

    public Ressenya(Usuari usuari, Avaluable avaluable, String comentari, Image[] imatges) {
        super(usuari, avaluable);
        this.comentari = comentari;
        this.imatges = imatges;
    }

    public String getComentari() {
        return comentari;
    }

    public Image[] getImatges() {
        return imatges;
    }

    public int obtenirRecompensa() {
        if (imatges == null) {
            return 5;
        }

        return 5 + imatges.length * 15;
    }
}
