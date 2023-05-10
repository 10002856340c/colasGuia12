
package Punto2;


import java.util.Queue;

import java.util.Scanner;

class main{

 public static void main(String[] args) {
        cola cola = new cola();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del producto (0 para terminar): ");
        int codigo = scanner.nextInt();

        while (codigo != 0) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.next();
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = scanner.nextInt();
            System.out.print("Ingrese el valor unitario del producto: ");
            double valorUnitario = scanner.nextDouble();

            cola.agregar(codigo, nombre, cantidad, valorUnitario);

            System.out.print("Ingrese el código del producto (0 para terminar): ");
            codigo = scanner.nextInt();
        }

        double valorTotal = 0;
        Nodo productoActual = cola.atender();
        while (productoActual != null) {
            double subtotal = productoActual.cantidad * productoActual.valorUnitario;
            valorTotal += subtotal;
            System.out.println("Código: " + productoActual.codigo);
            System.out.println("Nombre: " + productoActual.nombre);
            System.out.println("Cantidad: " + productoActual.cantidad);
            System.out.println("Valor unitario: " + productoActual.valorUnitario);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("------------------------");

            productoActual = cola.atender();
        }

        System.out.println("Valor total de la compra: " + valorTotal);
    }
}



