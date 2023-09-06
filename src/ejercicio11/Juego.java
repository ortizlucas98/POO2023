package ejercicio11;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Juego {
    private Jugador J1;
    private Jugador J2;
    private String ganador;

    private Diccionario D;

    public Juego(String jugador1,String jugador2){
        this.J1 = new Jugador(jugador1);
        this.J2 = new Jugador(jugador2);
        D = new Diccionario();
    }

    public void mostrarDiccionario(){
        this.D.mostrarTodasLasPalabras();
    }

    public void mostrarJugadores(){
        J1.mostrarDatos();
        System.out.println("----------------");
        J2.mostrarDatos();
        System.out.println("----------------");
    }

    public void obtenerGanador(Jugador jugador1, Jugador jugador2) {
        if (jugador1 != null && jugador2 != null) {
            if (jugador1.getPuntajeTotal() > jugador2.getPuntajeTotal()) {
                System.out.println("El ganador es:");
                jugador1.mostrarDatos();
            } else if (jugador2.getPuntajeTotal() > jugador1.getPuntajeTotal()) {
                System.out.println("El ganador es:");
                jugador2.mostrarDatos();
            } else {
                System.out.println("Hay un empate entre los dos jugadores.");
            }
        }
    }

    public Jugador getJ1(){
        return this.J1;
    }

    public Jugador getJ2() {
        return this.J2;
    }

    public boolean verificarSiEstaEnDic(String palabra) {
        return D.getDiccionario().contains(palabra);
    }

    public void Jugarturno(Jugador J,String palabra){
        if(verificarSiEstaEnDic(palabra)){
            J.jugarIntento(palabra);
            J.agregarPalabraLograda(palabra);
        }else{
            System.out.println("----------------------------------");
        }
    }
}


