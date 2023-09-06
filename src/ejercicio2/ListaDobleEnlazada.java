package ejercicio2;
import paqueteNodo.Nodo;
import paqueteNodo.NodoDoble;
public class ListaDobleEnlazada {
    private NodoDoble cabeza;
    private NodoDoble cola;
    int cantidad;

    public ListaDobleEnlazada() {
        cabeza = null;
        cola = null;
        cantidad = 0;
    }

    public int  longitud(){
        return cantidad;
    }

    public Boolean esVacia(){
        return (this.cabeza==null);
    }
    public void agregar(Object elemento) {
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(elemento);
        if (esVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setNodoAnterior(cola);
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        }
        cantidad++;
    }
    public boolean eliminarPos(int pos) {
        if (pos > cantidad || pos < 1) {
            return false;
        }

        //contemplo el primer elemento
        if (pos == 1) {
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setNodoAnterior(null);
            } else {
                cola = null;
            }
            cantidad--;
            return true;
        }

        //esto sirve en los demas casos
        int iterador = 1;
        NodoDoble nodoAux = cabeza;
        while (iterador <= pos) {
            nodoAux = nodoAux.getSiguiente();
            iterador++;
        }

        NodoDoble nodoAnterior = nodoAux.getNodoAnterior();
        NodoDoble nodoSiguiente = nodoAux.getSiguiente();

        nodoAnterior.setSiguiente(nodoSiguiente);

        if (nodoSiguiente != null) {
            nodoSiguiente.setNodoAnterior(nodoAnterior);
        } else {
            cola = nodoAnterior;
        }

        cantidad--;
        return true;
    }
    public Object recuperar(int pos) {
        if (pos < 1 || pos > this.cantidad) {
            return null;
        }

        int iter = 1;
        NodoDoble datoRecuperado = this.cabeza;
        while (datoRecuperado != null && iter < pos) {
            datoRecuperado = datoRecuperado.getSiguiente();
            iter++;
        }
        return datoRecuperado;
    }

    public boolean insertar(int pos, Object dato) {
        if (pos > cantidad + 1 || pos < 1) {
            return false;
        }
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);
        if (pos == 1) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setNodoAnterior(nuevoNodo);
            cabeza = nuevoNodo;
        } else if (pos == cantidad + 1) {
            nuevoNodo.setNodoAnterior(cola);
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        } else {
            int iterador = 1;
            NodoDoble nodoAux = cabeza;
            while (iterador < pos) {
                nodoAux = nodoAux.getSiguiente();
                iterador++;
            }

            NodoDoble nodoSiguiente = nodoAux.getSiguiente();

            nodoAux.setSiguiente(nuevoNodo);
            nuevoNodo.setNodoAnterior(nodoAux);

            nuevoNodo.setSiguiente(nodoSiguiente);
            nodoSiguiente.setNodoAnterior(nuevoNodo);
        }

        cantidad++;
        return true;
    }
    public void mostrarDatos() {
        NodoDoble nodoActual = this.cabeza;
        while (nodoActual != null) {
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
    }
}
