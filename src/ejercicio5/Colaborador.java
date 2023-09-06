package ejercicio5;

import java.util.ArrayList;

public class Colaborador {
    private String nombre;
    private final ArrayList<Tarea> listaDeTareasRealizadas;
    private int cantTareasRealizadas;

    public Colaborador(String nombre){
        this.nombre = nombre;
        this.listaDeTareasRealizadas = new ArrayList<>();
        this.cantTareasRealizadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantTareasRealizadas(){
        this.cantTareasRealizadas += 1;
    }

    public ArrayList<Tarea> getListaDeTareasRealizadas() {
        return listaDeTareasRealizadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarListaDeTareasRealizadas() {
        int i = 0;
        System.out.println("Tareas realizadas por :"+ this.nombre);
        while(i<this.listaDeTareasRealizadas.size()){
            System.out.println(this.listaDeTareasRealizadas.get(i).getDescripcion());
            i++;
        }
    }
}
