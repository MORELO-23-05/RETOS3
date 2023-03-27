package JuegoPPT.Ejecuccion;

import JuegoPPT.PPT;

public class Ejecuccion {
    public static void main(String[] args) {
        PPT juego = new PPT();
        juego.iniciar();
        juego.jugar();
        juego.fin();
    }
}
