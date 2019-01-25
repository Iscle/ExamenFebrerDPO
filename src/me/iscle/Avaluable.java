package me.iscle;

import java.util.ArrayList;

public class Avaluable {
    private String id;
    private ArrayList<Valoracio> valoracions;

    public Avaluable(int count) {
        id = generarId(count);
        valoracions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Valoracio> getValoracions() {
        return valoracions;
    }

    public void afegirValoracio(Valoracio v) {
        valoracions.add(v);
    }

    private static String generarId(int count) {
        return "0x" + Long.toHexString(count);
    }
}
