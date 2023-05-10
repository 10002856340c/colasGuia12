
package Punto1;



import java.util.Queue;

public class main{
   
   public static void main(String[] args) {

        cola cola = new cola();
        for (int i = 20; i <= 35; i++) {
            cola.agregar(i);
        }
       
        int clientesAtendidos = 0;
        int clientesRestantes = 0;
       
        while (clientesAtendidos < 2) {
            int clienteActual = cola.atender();
            if (clienteActual == -1) {
                break;
            }
            System.out.println("Se atendió al cliente " + clienteActual);
            clientesAtendidos++;
        }
       
        System.out.println("\nClientes restantes en la cola: ");
        Nodo nodoActual = cola.cabeza;
        while (nodoActual != null) {
            System.out.println(nodoActual.cliente);
            nodoActual = nodoActual.siguiente;
            clientesRestantes++;
        }
        System.out.println("Total de clientes restantes: " + clientesRestantes);
    }
}