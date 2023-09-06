package ejercicio5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Objects;

public class listaDeTareas {
    private final ArrayList<Tarea> listadetareas;
    private ArrayList<Tarea> listadetareasnovencidas;

    private ArrayList<Colaborador> listaDeColaboradores;
    private int cantidad;

    public listaDeTareas(){
        this.listadetareas = new ArrayList<>();
        this.listadetareasnovencidas = new ArrayList<>();
        this.listaDeColaboradores = new ArrayList<>();
        this.cantidad=0;
    }

    public void mostrarTareaEspecifica(int numTarea){
        this.listadetareas.get(numTarea).mostrarTareaCompleta();
    }

    public void mostrarTodasLasTareas(){
        int i=0;
        while(i<this.cantidad){
            this.mostrarTareaEspecifica(i);
            System.out.println("-------------------------------");
            i++;
        }
    }

    public void aniadirTarea(String desc,int prioridad,LocalDate fecha,int idtarea,LocalDate fechaRecordatorio){
        Tarea nuevaTarea = new Tarea(desc,prioridad,fecha,idtarea,fechaRecordatorio);
        this.listadetareas.add(nuevaTarea);
        this.cantidad++;
    }

    public Tarea getTarea(int numTarea){
        return this.listadetareas.get(numTarea);
    }

    public void eliminarTarea(int numTarea){
        this.listadetareas.remove(numTarea-1);
        this.cantidad--;
    }

    private  void ObtenerListasNoVencidas(){
        int i = 0;
        ArrayList<Tarea> tareasNoVencidas = new ArrayList<>();
        while(i<this.listadetareas.size()){
            if(!Objects.equals(this.listadetareas.get(i).getEstado().toString(), "vencida")){
                tareasNoVencidas.add(this.listadetareas.get(i));
            }
            i++;
        }
        this.listadetareasnovencidas = tareasNoVencidas;
    }
    public void burbujeo() {
        int n = listadetareasnovencidas.size();
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                Tarea tareaActual = listadetareasnovencidas.get(j);
                Tarea tareaSiguiente = listadetareasnovencidas.get(j + 1);

                // Primero, ordena por prioridad
                if (tareaActual.getPrioridad() > tareaSiguiente.getPrioridad()) {
                    Tarea temp = listadetareasnovencidas.get(j);
                    listadetareasnovencidas.set(j, listadetareasnovencidas.get(j+1));
                    listadetareasnovencidas.set(j+1, temp);
                    intercambiado = true;
                }
                // Si tienen la misma prioridad, entonces ordena por fecha
                else if (tareaActual.getPrioridad() == tareaSiguiente.getPrioridad()
                        && tareaActual.getFechaLimite().isAfter(tareaSiguiente.getFechaLimite())){
                    Tarea temp = listadetareasnovencidas.get(j);
                    listadetareasnovencidas.set(j, listadetareasnovencidas.get(j+1));
                    listadetareasnovencidas.set(j+1, temp);
                    intercambiado = true;
                }
            }

            // Si no se realizó ningún intercambio en esta pasada,salgo
            if (!intercambiado) {
                break;
            }
        }
    }
    public void Listadetareasnovencidas(){
        ObtenerListasNoVencidas();
        burbujeo();

        int i = 0;
        while(i<this.listadetareasnovencidas.size()){
            this.listadetareasnovencidas.get(i).mostrarTareaCompleta();
            i++;
        }
    }

    public void buscarTareaPorNombre(String descripcion){
        int i = 0;
        boolean b=true;
        while(i<this.listadetareas.size() && b){
            if(listadetareas.get(i).getDescripcion().equals(descripcion)){
                System.out.println("Encontrada :");
                listadetareas.get(i).mostrarTareaCompleta();
                b = false;
            }
            i++;
        }
        if(b){
            System.out.println("No existe una tarea con esa descripcion...");
        }
    }

    public ArrayList<Tarea> getListadetareasnovencidas(){return this.listadetareasnovencidas;}

    public ArrayList<Colaborador> getListadetareasDeColaboradores(){return this.listaDeColaboradores;}
    public void agregarColaborador(String nombre){
        Colaborador c = new Colaborador(nombre);
        this.listaDeColaboradores.add(c);
    }

    public Colaborador getColaborador(String nombre) {
        for (Colaborador colaborador : listaDeColaboradores) {
            if (colaborador.getNombre().equals(nombre)) {
                return colaborador;
            }
        }
        return null;
    }
}
