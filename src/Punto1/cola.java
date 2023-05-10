
package Punto1;

/**
 *
 * @author USUARIO
 */
public class cola{
   
    
   
    public Nodo cabeza;
    public Nodo cola;
   
    public cola() {
        cabeza = null;
        cola = null;
    }
   
    public void agregar(int cliente) {
        Nodo nuevoNodo = new Nodo(cliente);
        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }
   
    public int atender() {
        if (cabeza == null) {
            return -1;
        }
        int cliente = cabeza.cliente;
        cabeza = cabeza.siguiente;
        if (cabeza == null) {
            cola = null;
        }
        return cliente;
    }
}