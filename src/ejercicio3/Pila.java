package ejercicio3;
import paqueteNodo.Nodo;
public class Pila {
    private Nodo nodoTope;

    public Pila() {
        this.nodoTope = null;
    }

    public void apilar(Object elemento) {
        Nodo nodoAux = new Nodo();
        nodoAux.setDato(elemento);
        nodoAux.setSiguiente(this.nodoTope);
        this.nodoTope = nodoAux;
    }

    public void desapilar() {
        if (!esVacia()) {
            this.nodoTope = this.nodoTope.getSiguiente();
        } else {
            System.out.println("La pila está vacía. No se puede desapilar.");
        }
    }

    public Object getTope() {
        if (!esVacia()) {
            return this.nodoTope.getDato();
        } else {
            return null;
        }
    }

    public boolean esVacia() {
        return this.nodoTope == null;
    }
}
