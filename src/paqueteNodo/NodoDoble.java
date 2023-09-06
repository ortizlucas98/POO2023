package paqueteNodo;

public class NodoDoble {
    private Object dato;
    private NodoDoble nodoSiguiente;
    private NodoDoble nodoAnterior;

    public NodoDoble(){
        this.dato = null;
        this.nodoSiguiente = null;
        this.nodoAnterior = null;
    }

    public void setDato(Object nuevoDato) {
        this.dato = nuevoDato;
    }
    public Object getDato() {
        return dato;
    }

    public void setSiguiente(NodoDoble nuevoNodoSiguiente){
        this.nodoSiguiente = nuevoNodoSiguiente;
    }

    public NodoDoble getSiguiente() {
        return nodoSiguiente;
    }

    public NodoDoble getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoDoble nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
}
