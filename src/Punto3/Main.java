
package Punto3;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class main{
    public static void main(String[] args) {
        cola cola = new cola();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese el nombre de la persona " + i + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el documento de la persona " + i + ":");
            String documento = scanner.nextLine();
            cola.agregar(nombre, documento);
        }
       
        System.out.println("\nReporte de personas en la cola:");
        Nodo nodoActual = cola.cabeza;
        while (nodoActual != null) {
            System.out.println("Nombre: " + nodoActual.nombre + ", Documento: " + nodoActual.documento);
            nodoActual = nodoActual.siguiente;
        }
       
        System.out.println("\nAtendiendo a cuatro personas:");
        try {
            File file = new File("atendidos.txt");
            FileWriter writer = new FileWriter(file);
            for (int i = 1; i <= 4; i++) {
                Nodo personaAtendida = cola.atender();
                if (personaAtendida == null) {
                    break;
                }
                writer.write("Nombre: " + personaAtendida.nombre + ", Documento: " + personaAtendida.documento + "\n");
                System.out.println("Se atendió a la persona con nombre " + personaAtendida.nombre);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en archivo");
        }
       
        System.out.println("\nReporte de personas restantes en la cola:");
        nodoActual = cola.cabeza;
        while (nodoActual != null) {
            System.out.println("Nombre: " + nodoActual.nombre + ", Documento: " + nodoActual.documento);
            nodoActual = nodoActual.siguiente;
        }
    }
}

