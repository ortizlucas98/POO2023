package ejercicio4;
import paqueteNodo.Nodo;
public class Cola {
    private Nodo nodoInicio;
    private Nodo nodoFinal;

    public Cola() {
        this.nodoInicio = null;
        this.nodoFinal = null;
    }

    public void encolar(Object elemento) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(elemento);
        if (this.esVacia()) {
            this.nodoInicio = nuevoNodo;
            this.nodoFinal = nuevoNodo;
        } else {
            this.nodoFinal.setSiguiente(nuevoNodo);
            this.nodoFinal = nuevoNodo;
        }
    }

    public void desencolar() {
        if (!esVacia()) {
            this.nodoInicio = this.nodoInicio.getSiguiente();
            if (this.nodoInicio == null) {
                // Si el inicio es null, la cola está vacía, así que también actualizamos nodoFinal.
                this.nodoFinal = null;
            }
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
        }
    }

    public Object recuperar() {
        if (!esVacia()) {
            return this.nodoInicio.getDato();
        } else {
            return null; // La cola está vacía, no hay elementos para recuperar.
        }
    }

    public Boolean esVacia() {
        return this.nodoInicio == null;
    }

    public void mostrarElementos() {
        Nodo nodoActual = this.nodoInicio;
        while (nodoActual != null) {
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
    }

}
