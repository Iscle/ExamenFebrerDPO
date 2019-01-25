package me.iscle;

import java.awt.*;
import java.util.ArrayList;

public class SistemaDeValoracions {

    private ArrayList<Usuari> usuaris;
    private ArrayList<Avaluable> avaluables;

    public SistemaDeValoracions() {
        usuaris = new ArrayList<>();
        avaluables = new ArrayList<>();
    }

    public boolean registrarUsuari(long id, String nom) {
        if (getUserById(id) != null) {
            return false;
        }

        usuaris.add(new Usuari(id, nom));
        return true;
    }

    public boolean nouAvaluable(String nom, boolean esServei) {
        avaluables.add(new Infraestructura(nom, esServei, avaluables.size()));
        return true;
    }

    public boolean nouAvaluable(String nom, String cognom, String etiqueta) {
        avaluables.add(new Treballador(nom, cognom, etiqueta, avaluables.size()));
        return true;
    }

    public Usuari usuariMillorRecompensa() {
        Usuari millor = usuaris.get(0);

        for (Usuari u:usuaris) {
            if (u.calcularRecompensa() > millor.calcularRecompensa()) {
                millor = u;
            }
        }

        return millor;
    }

    public void afegirValoracio(long idUsuari, String idAvaluable, double puntuacio) throws IdentifierNotFoundException {
        Usuari usuari = getUserById(idUsuari);
        Avaluable avaluable = getAvaluableById(idAvaluable);

        if (usuari == null || avaluable == null) {
            throw new IdentifierNotFoundException(usuari, avaluable, "No s'ha trobat l'usuari o l'avaluable!");
        }

        Valoracio v = new Puntuacio(usuari, avaluable, puntuacio);
        usuari.afegirValoracio(v);
        avaluable.afegirValoracio(v);
    }

    public void afegirValoracio(long idUsuari, String idAvaluable, String comentari, Image[] imatges) throws IdentifierNotFoundException {
        Usuari usuari = getUserById(idUsuari);
        Avaluable avaluable = getAvaluableById(idAvaluable);

        if (usuari == null || avaluable == null) {
            throw new IdentifierNotFoundException(usuari, avaluable, "No s'ha trobat l'usuari o l'avaluable!");
        }

        if (imatges == null) {
            imatges = new Image[0];
        }

        Valoracio v = new Ressenya(usuari, avaluable, comentari, imatges);
        usuari.afegirValoracio(v);
        avaluable.afegirValoracio(v);
    }

    private Usuari getUserById(long id) {
        for (Usuari u:usuaris) {
            if (u.getId() == id) {
                return u;
            }
        }

        return null;
    }

    private Avaluable getAvaluableById(String id) {
        for (Avaluable a:avaluables) {
            if (id.equals(a.getId())) {
                return a;
            }
        }

        return null;
    }
}
