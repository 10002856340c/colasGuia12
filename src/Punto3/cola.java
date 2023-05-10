
package Punto3;


public class cola {
    

    public Nodo cabeza;
    public Nodo cola;
   
    public cola() {
        cabeza = null;
        cola = null;
    }
   
    public void agregar(String nombre, String documento) {
        Nodo nuevoNodo = new Nodo(nombre, documento);
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
        Nodo persona = cabeza;
        cabeza = cabeza.siguiente;
        if (cabeza == null) {
            cola = null;
        }
        return persona;
    }
}
