package me.iscle;

public class Main {

    public static void main(String[] args) {
	    SistemaDeValoracions sdv = new SistemaDeValoracions();

	    sdv.registrarUsuari(0, "Iscle");
	    sdv.nouAvaluable("Bar", true);

	    try {
            sdv.afegirValoracio(0, "0x0", 4.76);
            sdv.afegirValoracio(0, "0x0", "Correcte", null);

            System.out.println("Recompensa: " + sdv.usuariMillorRecompensa().calcularRecompensa());
        } catch (IdentifierNotFoundException e) {
	        e.printStackTrace();
        }
    }
}
