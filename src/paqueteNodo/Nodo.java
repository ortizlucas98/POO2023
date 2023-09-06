package paqueteNodo;

public class Nodo {
    private Object dato;
    private Nodo nodoSiguiente;

    public Nodo(){
        this.dato = null;
        this.nodoSiguiente = null;
    }
    public void setDato(Object nuevoDato) {
        this.dato = nuevoDato;
    }
    public Object getDato() {
        return dato;
    }

    public void setSiguiente(Nodo nuevoNodoSiguiente){
        this.nodoSiguiente = nuevoNodoSiguiente;
    }

    public Nodo getSiguiente() {
        return nodoSiguiente;
    }
}
