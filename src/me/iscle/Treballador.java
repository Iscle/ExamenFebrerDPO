package me.iscle;

public class Treballador extends Avaluable {
    private String nom;
    private String cognom;
    private String rol;

    public Treballador(String nom, String cognom, String rol, int count) {
        super(count);
        this.nom = nom;
        this.cognom = cognom;
        this.rol = rol;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getRol() {
        return rol;
    }
}
