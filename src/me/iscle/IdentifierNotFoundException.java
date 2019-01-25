package me.iscle;

public class IdentifierNotFoundException extends Exception {
    private Usuari usuari;
    private Avaluable avaluable;

    public IdentifierNotFoundException(Usuari usuari, Avaluable avaluable, String message) {
        super(message);
        this.usuari = usuari;
        this.avaluable = avaluable;
    }
}
