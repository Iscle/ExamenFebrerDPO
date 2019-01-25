package me.iscle;

import java.util.ArrayList;

public class Usuari {
    private long id;
    private String nom;
    private ArrayList<Valoracio> valoracions;

    public Usuari(long id, String nom) {
        this.id = id;
        this.nom = nom;
        this.valoracions = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Valoracio> getValoracions() {
        return valoracions;
    }

    public void afegirValoracio(Valoracio v) {
        valoracions.add(v);
    }

    public int calcularRecompensa() {
        int suma = 0;

        for (Valoracio v:valoracions) {
            if (v instanceof Recompensable) {
                suma += ((Recompensable) v).obtenirRecompensa();
            }
        }

        return suma;
    }
}
