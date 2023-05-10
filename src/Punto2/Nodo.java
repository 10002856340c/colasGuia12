
package Punto2;


class Nodo {
        int codigo;
        String nombre;
        int cantidad;
        double valorUnitario;
        Nodo siguiente;

        public Nodo(int codigo, String nombre, int cantidad, double valorUnitario) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.valorUnitario = valorUnitario;
            this.siguiente = null;
        }
    }
    