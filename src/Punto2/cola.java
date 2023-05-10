
package Punto2;

public class cola {


    public Nodo cabeza;
    public Nodo cola;

    public cola() {
        cabeza = null;
        cola = null;
    }

    public void agregar(int codigo, String nombre, int cantidad, double valorUnitario) {
        Nodo nuevoNodo = new Nodo(codigo, nombre, cantidad, valorUnitario);
        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public Nodo atender() {
        if (cabeza == null) {
            return null;
        }
        Nodo producto = cabeza;
        cabeza = cabeza.siguiente;
        if (cabeza == null) {
            cola = null;
        }
        return producto;
    }









}