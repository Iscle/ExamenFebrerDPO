package me.iscle;

public class Valoracio {
    private Usuari usuari;
    private Avaluable avaluable;

    public Valoracio(Usuari usuari, Avaluable avaluable) {
        this.usuari = usuari;
        this.avaluable = avaluable;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public Avaluable getAvaluable() {
        return avaluable;
    }
}
