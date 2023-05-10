
package Punto3;


class Nodo {

        String nombre;
        String documento;
        Nodo siguiente;
       
        public Nodo(String nombre, String documento) {
            this.nombre = nombre;
            this.documento = documento;
            this.siguiente = null;
        }
    }