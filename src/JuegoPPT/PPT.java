package JuegoPPT;

import java.util.Random;
import java.util.Scanner;

public class PPT {
    
    private static final String[] opciones = {"Piedra", "Papel", "Tijera"};
    private static final int PIEDRA = 0;
    private static final int PAPEL = 1;
    private static final int TIJERA = 2;
    private int opcionJugador;
    private int opcionComputadora;
    private int puntosJugador;
    private int puntosComputadora;
    
    public PPT() {
        this.puntosJugador = 0;
        this.puntosComputadora = 0;
    }
    
    public int getPuntosJugador() {
        return puntosJugador;
    }
    
    public int getPuntosComputadora() {
        return puntosComputadora;
    }
    public void jugar() {
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();
        
        while (puntosJugador < 3 && puntosComputadora < 3) {
            System.out.println("Elija su opción (0=Piedra, 1=Papel, 2=Tijera):");
            opcionJugador = lectura.nextInt();
            opcionComputadora = random.nextInt(3);
            System.out.println("Usted eligió " + opciones[opcionJugador] + ".");
            System.out.println("La computadora eligió " + opciones[opcionComputadora] + ".");
            if (opcionJugador == opcionComputadora) {
                System.out.println("Empate.");
            } else if (opcionJugador == PIEDRA && opcionComputadora == TIJERA ||
                       opcionJugador == PAPEL && opcionComputadora == PIEDRA ||
                       opcionJugador == TIJERA && opcionComputadora == PAPEL) {
                System.out.println("Usted gana esta ronda.");
                puntosJugador++;
            } else {
                System.out.println("La computadora gana esta ronda.");
                puntosComputadora++;
            }
            System.out.println("Marcador: Usted " + puntosJugador + " - " + puntosComputadora + " Computadora.");
            System.out.println();
           
        }
        lectura.close();
    }
    
    public void fin() {
        if (puntosJugador > puntosComputadora) {
            System.out.println("¡Felicitaciones, usted ganó el juego!");
        } else if (puntosJugador < puntosComputadora) {
            System.out.println("Lo siento, usted perdió el juego.");
        } else {
            System.out.println("El juego terminó en empate.");
        }
        System.out.println("Marcador final: Usted " + puntosJugador + " - " + puntosComputadora + " Computadora.");
    }

    public void iniciar() {
    }
}