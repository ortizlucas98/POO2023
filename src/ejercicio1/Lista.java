package ejercicio1;
import paqueteNodo.Nodo;
public class Lista {
        private Nodo nodoPrimario;
        private int cantidad;

        public Lista() {
            this.nodoPrimario = null;
            this.cantidad = 0;
        }

        public int longitud() {
            return cantidad;
        }

        public boolean esVacia() {
            return (this.nodoPrimario == null);
        }

        public void agregar(Object elemento) {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setDato(elemento);
            if (this.esVacia()) {
                this.nodoPrimario = nuevoNodo;
            } else {
                Nodo nodoAux = nodoPrimario;
                while (nodoAux.getSiguiente() != null) {
                    nodoAux = nodoAux.getSiguiente();
                }
                nodoAux.setSiguiente(nuevoNodo);
            }
            this.cantidad += 1;
        }

        public boolean eliminarPos(int pos) {
            if (pos < 1 || pos > this.cantidad) {
                return false;
            }

            if (pos == 1) {
                this.nodoPrimario = nodoPrimario.getSiguiente();
            } else {
                int iterador = 1;
                Nodo nodoAux = this.nodoPrimario;
                Nodo nodoAnt = null;
                while (iterador <= pos) {
                    nodoAnt = nodoAux;
                    nodoAux = nodoAux.getSiguiente();
                    iterador += 1;
                }
                nodoAnt.setSiguiente(nodoAux.getSiguiente());
            }
            this.cantidad -= 1;
            return true;
        }

        public Object recuperar(int pos) {
            if (pos < 1 || pos > this.cantidad) {
                return null; // Valor no válido
            }

            Nodo datoRecuperado = this.nodoPrimario;
            int iter = 1;
            while (iter < pos) {
                datoRecuperado = datoRecuperado.getSiguiente();
                iter++;
            }
            return datoRecuperado.getDato();
        }

        public boolean insertar(int pos, Object dato) {
            if (pos < 1 || pos > this.cantidad + 1) {
                return false;
            }

            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setDato(dato);

            if (pos == 1) {
                nuevoNodo.setSiguiente(nodoPrimario);
                this.nodoPrimario = nuevoNodo;
            } else {
                int iterador = 1;
                Nodo nodoAux = this.nodoPrimario;
                Nodo nodoAnt = null;
                while (iterador <= pos) {
                    nodoAnt = nodoAux;
                    nodoAux = nodoAux.getSiguiente();
                    iterador += 1;
                }
                nodoAnt.setSiguiente(nuevoNodo);
                nuevoNodo.setSiguiente(nodoAux);
            }
            this.cantidad += 1;
            return true;
        }

    public void mostrarDatos() {
        Nodo nodoActual = this.nodoPrimario;
        while (nodoActual != null) {
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
    }
}
