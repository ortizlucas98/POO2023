package ejercicio11;

import java.util.ArrayList;

public class Jugador {
    private ArrayList<String> palabrasLogradas;
    private String nombre;
    private int puntajeTotal;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.palabrasLogradas = new ArrayList<>();
        this.puntajeTotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void agregarPalabraLograda(String p){
        this.palabrasLogradas.add(p);
    }

    public int jugarIntento(String intento){
        int puntos = 0;
        Palabra palabraIntento = new Palabra(intento);
        puntos = palabraIntento.calcularValorEnPuntos();
        this.puntajeTotal += puntos;
        return puntos;
    }

    public void mostrarDatos(){
        System.out.println("Nombre : "+this.nombre);
        System.out.println("Puntaje : "+this.puntajeTotal);
        System.out.println("Lista de palabras: ");
        for (String s : this.palabrasLogradas){
            System.out.print(s+" - ");
        }
        System.out.println(" ");
    }
}
