package ejercicio5;

import java.time.LocalDate;
public class Tarea {
    private String descripcion;
    private int prioridad; //del 1 al 3 siendo 1 la mas urgente y 3 la menos urgente
    private Estado estado;
    private LocalDate fechaLimite; //por ahora string, investigar el uso de la fecha como tipo de dato
    private LocalDate fechaRecordatorio;

    private LocalDate fechaFinalizacion;
    private int numeroDeTarea;
    private Colaborador personaQueResolvioLaTarea;

    //Constructor
    public Tarea(String descripcion,int prioridad,LocalDate fechaLimite,int numeroDeTarea,LocalDate fechaRcordatorio){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.numeroDeTarea = numeroDeTarea;
        this.setFecha(fechaLimite);
        this.fechaRecordatorio = fechaRcordatorio;
        this.personaQueResolvioLaTarea=null;
        this.fechaFinalizacion=null;
    }

    //SETTERS
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad){this.prioridad=prioridad;}

    public void verificarFechaRecordatirio(){if(this.fechaRecordatorio.isBefore(LocalDate.now()) || this.fechaRecordatorio.isEqual(LocalDate.now()) && this.estado != Estado.vencida){
            this.prioridad = 1;
        }
    }

    //ESTA FUNCION ES DE CUANDO SE COMENZO EL EJERCICIO Y NO PEDIA UN COLABORADOR PARA MARCALAR COMO HECHA
    //ENCONCES SOLO LE DECIAS COMO QUERIA QUE SEA EL ESTADO Y ASI LO SETEABA. SIRVE PARA EL EJERCICIO 5 Y 10 Y AL FINAL DEL 12
    public void setEstado(String estado) {
        switch (estado) {
            case "incompleta" -> this.estado = Estado.incompleta;
            case "completa" -> this.estado = Estado.completa;
            case "vencida" -> this.estado = Estado.vencida;
            default -> System.out.println("Dato incorrecto en la carga de estado");
        }
    }

    public void finalizarTarea(Colaborador c){
        this.estado = Estado.completa;
        this.personaQueResolvioLaTarea = c;
        this.personaQueResolvioLaTarea.getListaDeTareasRealizadas().add(this);
        this.personaQueResolvioLaTarea.setCantTareasRealizadas();
        this.fechaFinalizacion = LocalDate.now();
    }

    public void finalizarTarea(Colaborador c,LocalDate fecha){
        this.estado = Estado.completa;
        this.personaQueResolvioLaTarea = c;
        this.personaQueResolvioLaTarea.getListaDeTareasRealizadas().add(this);
        this.personaQueResolvioLaTarea.setCantTareasRealizadas();
        this.fechaFinalizacion = fecha;
    }

    /*public void setColaborador(Colaborador c){
        this.personaQueResolvioLaTarea = c;
    }*/

    public Estado getEstado(){
        return this.estado;
    }

    public void setFecha(LocalDate fecha) {
        this.fechaLimite = fecha;
        this.estado = this.verificarVencimiento();
    }

    public void setNumeroDeTarea(int numeroDeTarea) {
        this.numeroDeTarea = numeroDeTarea;
    }

    public int getPrioridad(){
        return this.prioridad;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public LocalDate getFechaLimite(){
        return this.fechaLimite;
    }
    public void mostrarTareaCompleta(){
        boolean porVencer = (this.fechaLimite.isAfter(LocalDate.now()) || this.fechaLimite.isEqual(LocalDate.now()));

        if(porVencer && this.estado != Estado.completa){
            System.out.println("(Por vencer)");
        }
        System.out.println("Descripcion:"+this.descripcion);
        this.verificarFechaRecordatirio();
        System.out.println("Prioridad:"+this.prioridad);
        System.out.println("Fecha limite:"+this.fechaLimite);
        System.out.println("Estado:"+this.estado);
        System.out.println("ID tarea:"+this.numeroDeTarea);
        System.out.println("----------------------------");
        if(this.estado == Estado.completa){
            System.out.println("Realizada por : "+ this.personaQueResolvioLaTarea.getNombre());
            System.out.println("Fecha de finalizacion :"+this.fechaFinalizacion);
        }
    }

    private Estado verificarVencimiento(){
        if(this.fechaLimite.isBefore(LocalDate.now())){
            return Estado.vencida;
        }
        else return Estado.incompleta;
        }
}
